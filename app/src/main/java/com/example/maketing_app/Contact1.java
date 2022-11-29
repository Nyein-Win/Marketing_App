package com.example.maketing_app;

public class Contact1 {

    int photo;
    private  String Name;
    private String detail;

    public Contact1() {
    }

    public Contact1(int photo, String name, String detail) {
        this.photo = photo;
        Name = name;
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
