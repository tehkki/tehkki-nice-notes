package model;

import model.enums.CategoryEnum;

import java.util.Date;

public class Note {

    // properties:
    private String noteHeader;
    private String noteBody;
    private Date noteDate;
    private User noteCreator;
    private CategoryEnum noteCategory;

    // getters/setters:
    public String getNoteHeader() {
        return noteHeader;
    }

    public void setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public User getNoteCreator() {
        return noteCreator;
    }

    public CategoryEnum getNoteCategory() {
        return noteCategory;
    }

    public void setNoteCategory(CategoryEnum noteCategory) {
        this.noteCategory = noteCategory;
    }

    // constructors
    // constructor without category:
    public Note(String header, String body, Date date, User creator) {
        this.noteHeader = header;
        this.noteBody = body;
        this.noteDate = date;
        this.noteCreator = creator;
        this.noteCategory = CategoryEnum.UNCATEGORISED;
    }

    // constructor with category:
    public Note(String header, String body, Date date, User creator, CategoryEnum categoryEnum) {
        this.noteHeader = header;
        this.noteBody = body;
        this.noteDate = date;
        this.noteCreator = creator;
        this.noteCategory = categoryEnum;
    }

    // empty constructor:
    public Note(){
        noteDate = new Date();
        noteCategory = CategoryEnum.UNCATEGORISED;
    }
}
