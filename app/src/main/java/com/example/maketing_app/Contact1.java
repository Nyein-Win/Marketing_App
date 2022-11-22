package com.example.maketing_app;

public class Contact1 {
    int photo;
    private  String Name;

    public Contact1() {
    }

    public Contact1(int photo, String name) {
        this.photo = photo;
        Name = name;
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
}
