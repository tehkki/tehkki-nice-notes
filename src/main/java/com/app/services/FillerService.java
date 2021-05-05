package com.app.services;

import model.Note;
import model.User;
import model.enums.CategoryEnum;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FillerService
{
    private NoteService notesService;
    private UserService userService;

    @Autowired
    public FillerService(NoteService notesService, UserService userService) {
        this.notesService = notesService;
        this.userService = userService;

        this.FillMockData();
    }

    public void FillMockData() {
        User user0 = new User("Sigmund", "Freud", "lil_sigi@gmail.com");
        User user1 = new User("Carl Gustav", "Jung", "carlooo@gmail.com");

        userService.addUser(user0);
        userService.addUser(user1);

        notesService.addNewNote(new Note("Ego", "Where id was, there ego shall be.", new Date(), user0));
        notesService.addNewNote(new Note("Kids", "Children are completely egoistic; they feel their needs intensely and strive ruthlessly to satisfy them.", new Date(), user0, CategoryEnum.DIARY));
        notesService.addNewNote(new Note("The Interpretation of Dreams", "In the following pages, I shall demonstrate that there exists a psychological technique by which dreams may be interpreted and that upon the application of this method every dream will show itself to be a senseful psychological structure which may be introduced into an assignable place in the psychic activity of the waking state. I shall furthermore endeavor to explain the processes which give rise to the strangeness and obscurity of the dream, and to discover through them the psychic forces, which operate whether in combination or opposition, to produce the dream. This accomplished by investigation will terminate as it will reach the point where the problem of the dream meets broader problems, the solution of which must be attempted through other material", new Date(), user0, CategoryEnum.WORK));

        notesService.addNewNote(new Note("Chemistry", "The meeting of two personalities is like the contact of two chemical substances: if there is any reaction, both are transformed", new Date(), user1, CategoryEnum.THOUGHTS));
        notesService.addNewNote(new Note("Me", "I am not what happened to me, I am what I choose to become.", new Date(), user1, CategoryEnum.DIARY));
    }
}
