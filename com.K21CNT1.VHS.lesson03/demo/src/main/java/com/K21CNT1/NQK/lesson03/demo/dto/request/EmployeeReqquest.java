package com.K21CNT1.NQK.lesson03.demo.dto.request;

public class EmployeeRequest {  // Sửa từ EmployeeController -> EmployeeRequest
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeRequest() {
    }

    public EmployeeRequest(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
