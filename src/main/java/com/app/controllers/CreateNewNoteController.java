package com.app.controllers;

import com.app.services.NoteService;
import com.app.services.UserService;
import model.Note;
import model.User;
import model.enums.CategoryEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CreateNewNoteController {

    @Autowired
    private NoteService noteService;
    @Autowired
    private UserService userService;

    private String createNotePageName = "createNote";

    @GetMapping("/create-new-note")
    public String getCreationPage(Model model){
        model.addAttribute("newNote", new Note());
        return createNotePageName;
    }

    @PostMapping("/create-new-note")
    public String createNewNote(@ModelAttribute Note noteFromForm, Model model)
    {
        List<String> errorList = new ArrayList<>();
        // validation
        if (noteFromForm.getNoteHeader().isEmpty()){
            errorList.add("Header is empty and is mandatory");
        }
        if (noteFromForm.getNoteBody().isEmpty()){
            errorList.add("Note body is empty and is mandatory");
        }

        boolean isValidationSuccessful = (errorList.size() == 0);

        if (!isValidationSuccessful){
            model.addAttribute("validationErrors", errorList);
            model.addAttribute("newNote", noteFromForm);

            return createNotePageName;
        }
        else {
            User currentUser = userService.getCurrentUser();
            Note newNote = new Note(
                    noteFromForm.getNoteHeader(),
                    noteFromForm.getNoteBody(),
                    noteFromForm.getNoteDate(),
                    currentUser,
                    noteFromForm.getNoteCategory()
            );

            noteService.addNewNote(newNote);

            return "redirect:/notes";
        }
    }
}
