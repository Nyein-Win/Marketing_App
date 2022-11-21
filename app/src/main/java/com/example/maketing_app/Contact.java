package com.example.maketing_app;

public class Contact {

    private int photo;
    private String title;
    private String videoId;
    private String url;

    public Contact() {
    }

    public Contact(int photo, String title, String videoId, String url) {
        this.photo = photo;
        this.title = title;
        this.videoId = videoId;
        this.url = url;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}