package com.app.controllers;

import com.app.services.NoteService;
import com.app.services.NoteStorage;
import model.Note;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

@Controller
public class NotesController {

    private NoteService noteStore;

    public NotesController() {
        this.noteStore = new NoteService();
    }

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
