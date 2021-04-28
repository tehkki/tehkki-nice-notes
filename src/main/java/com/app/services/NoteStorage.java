package com.app.services;

import model.Note;
import model.User;

import java.util.*;

// Class with all operations that can be done with notes
public class NoteStorage {

    // All notes are stored here
    private List<Note> notes;

    // Constructor to initialize storage class
    public NoteStorage() {
        this.notes = new ArrayList<>();
    }

    // Method to get all stored notes
    public List<Note> getAllNotes(){
        return notes;
    }

    // Method to add a single note to storage
    public void addNote(Note note){
        notes.add(note);
    }

    // Method to get all notes for a single user by userId
    public List<Note> getUserNotes(Integer uniqueUserId){
        List<Note> foundNotes = new ArrayList<>();

        for (int i = 0; i < notes.size(); i++){
            Note uniqueNote = notes.get(i);

            if (uniqueNote.getNoteCreator().getUserId().equals(uniqueUserId)){
                foundNotes.add(uniqueNote);
            }
        }

        return foundNotes;
    }
}
