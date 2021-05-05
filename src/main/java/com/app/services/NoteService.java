package com.app.services;

import com.app.dao.NoteStorage;
import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Creates new Users and notes for each user
@Service
public class NoteService {
    @Autowired
    private NoteStorage noteStorage;

    // List with all notes for all users
    public List<Note> getAllNotes() {
        return noteStorage.getAllNotes();
    }

    // List with all notes for one user
    public List<Note> getUserNotes(Integer userId) {
        return noteStorage.getUserNotes(userId);
    }

    public Note addNewNote(Note newNote)
    {
        noteStorage.addNote(newNote);
        return newNote;
    }
}
