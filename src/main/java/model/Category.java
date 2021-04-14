package model;

public class Category {

    // Properties:
    private String catName;
    private int catPriority;

    public String getCatName() {
        return catName;
    }

    public int getCatPriority() {
        return catPriority;
    }

    public void setCatPriority(int catPriority) {
        this.catPriority = catPriority;
    }

    public Category(String catName, int catPriority) {
        this.catName = catName;
        this.catPriority = catPriority;
    }
}
