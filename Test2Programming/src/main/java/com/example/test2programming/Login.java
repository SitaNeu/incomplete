package com.example.test2programming;

public class Login {

    private int UserID ;
    private String UserName;

    private String Email;

    private String Password;

    public Login(int UserID, String UserName, String Email, String Password) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
    }

    public int getId() {
        return UserID;
    }

    public void setId(int UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}


