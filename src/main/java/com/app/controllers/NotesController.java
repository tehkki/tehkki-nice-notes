package com.app.controllers;

import com.app.services.NoteService;
import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//
@Controller
public class NotesController {

    @Autowired
    private NoteService noteStore;

    @GetMapping("/notes")
    public String getIndexPage(Model model){
        List<Note> allNotes = noteStore.getAllNotes();

        // What to pass to the web page
        model.addAttribute("notes", allNotes);
        return "notes";
    }

    // Creating one more endpoint
    @GetMapping("/notes/{userId}")
    public String getUserNotesPage(@PathVariable(value = "userId") Integer userId, Model model){
        List<Note> userNotes = noteStore.getUserNotes(userId);

        // What to pass to the web page
        model.addAttribute("notes", userNotes);
        return "notes";
    }
}
