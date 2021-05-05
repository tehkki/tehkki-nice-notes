package model.enums;

public enum CategoryEnum {
    THOUGHTS("#Thoughts"),
    DIARY("#MyDiary"),
    WORK("#Work"),
    UNCATEGORISED("#NoCategory");

    private String name;

    CategoryEnum(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
