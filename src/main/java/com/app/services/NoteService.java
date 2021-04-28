package com.app.services;

import model.Note;
import model.User;
import model.enums.CategoryName;

import java.util.Date;
import java.util.List;

// Creates new Users and notes for each user
public class NoteService {

    private NoteStorage noteStorage;

    public NoteService() {
        this.noteStorage = new NoteStorage();

        User user0 = new User("Sigmund", "Freud", "lil_sigi@gmail.com");
        User user1 = new User("Carl Gustav", "Jung", "carlooo@gmail.com");

        noteStorage.addNote(new Note("Ego", "Where id was, there ego shall be.", new Date(), user0));
        noteStorage.addNote(new Note("Kids", "Children are completely egoistic; they feel their needs intensely and strive ruthlessly to satisfy them.", new Date(), user0, CategoryName.DIARY));
        noteStorage.addNote(new Note("The Interpretation of Dreams", "In the following pages, I shall demonstrate that there exists a psychological technique by which dreams may be interpreted and that upon the application of this method every dream will show itself to be a senseful psychological structure which may be introduced into an assignable place in the psychic activity of the waking state. I shall furthermore endeavor to explain the processes which give rise to the strangeness and obscurity of the dream, and to discover through them the psychic forces, which operate whether in combination or opposition, to produce the dream. This accomplished by investigation will terminate as it will reach the point where the problem of the dream meets broader problems, the solution of which must be attempted through other material", new Date(), user0, CategoryName.WORK));

        noteStorage.addNote(new Note("Chemistry", "The meeting of two personalities is like the contact of two chemical substances: if there is any reaction, both are transformed", new Date(), user1, CategoryName.THOUGHTS));
        noteStorage.addNote(new Note("Me", "I am not what happened to me, I am what I choose to become.", new Date(), user1, CategoryName.DIARY));
    }

    // List with all notes for all users
    public List<Note> getAllNotes() {
        return noteStorage.getAllNotes();
    }

    // List with all notes for one user
    public List<Note> getUserNotes(Integer userId) {
        return noteStorage.getUserNotes(userId);
    }
}
