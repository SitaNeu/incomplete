package com.example.test2programming;

public class crud {

    private int AttendanceID ;
    private String EmployeeName;

    private String Date;

    private String Status;

    public crud(int AttendanceID, String EmployeeName, String Date, String Status) {
        this.AttendanceID = AttendanceID;
        this.EmployeeName = EmployeeName;
        this.Date = Date;
        this.Status = Status;
    }

    public int getId() {
        return AttendanceID;
    }

    public void setId(int AttendanceID) {
        this.AttendanceID = AttendanceID;
    }

    public String getName() {
        return EmployeeName;
    }

    public void setName(String UserName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmail() {
        return Date;
    }

    public void setEmail(String Date) {
        this.Date = Date;
    }

    public String getPassword() {
        return Status;
    }

    public void setPassword(String Status) {
        this.Status = Status;
    }
}


