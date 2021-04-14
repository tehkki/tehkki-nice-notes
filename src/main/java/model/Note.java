package model;

import model.enums.CategoryName;

import java.util.Date;

public class Note {

    // properties:
    private String noteHeader;
    private String noteBody;
    private Date noteDate;
    private User noteCreator;
    private CategoryName noteCategory;

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

    public CategoryName getNoteCategory() {
        return noteCategory;
    }

    public void setNoteCategory(CategoryName noteCategory) {
        this.noteCategory = noteCategory;
    }

    // constructors
    // constructor without category:
    public Note(String header, String body, Date date, User creator) {
        this.noteHeader = header;
        this.noteBody = body;
        this.noteDate = date;
        this.noteCreator = creator;
        this.noteCategory = CategoryName.UNCATEGORISED;
    }

    // constructor with category:
    public Note(String header, String body, Date date, User creator, CategoryName categoryName) {
        this.noteHeader = header;
        this.noteBody = body;
        this.noteDate = date;
        this.noteCreator = creator;
        this.noteCategory = categoryName;
    }
}
