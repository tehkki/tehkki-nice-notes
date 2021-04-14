package model;

public class User {

    // Properties:
    private String userFirstName;
    private String userLastName;
    private String emailAddress;
    private Integer userId;
    // To have user id, we must use static variable to have a possibility to store latest created id
    private static Integer lastUserId = 0;

    // A proper constructor, strictly defines what data is needed for the class to be created. Data can later be modified with getter/setters
    public User(String firstName, String lastName, String email) {
        userFirstName = firstName;
        userLastName = lastName;
        emailAddress = email;
        //increase user id by 1
        User.lastUserId++;
        userId = User.lastUserId;
    }

//    a BAD constructor, allows not setting properties and using class as is with "null" values
//    public User() {
//    }

    // getters/setters:
    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getUserId() {
        return userId;
    }
}
