package model.enums;

public enum CategoryName {
    THOUGHTS("#Thoughts"),
    DIARY("#MyDiary"),
    WORK("#Work"),
    UNCATEGORISED("#NoCategory");

    private String name;

    CategoryName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
