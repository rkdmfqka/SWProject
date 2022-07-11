package com.example.demo.model;

public class Camera {
    String time;
    String photo;
    int camera_id;

    public Camera() {
    }

    public Camera(String time, String photo, int camera_id) {
        this.time = time;
        this.photo = photo;
        this.camera_id = camera_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getCamera_id() {
        return camera_id;
    }

    public void setCamera_id(int camera_id) {
        this.camera_id = camera_id;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "time='" + time + '\'' +
                ", photo='" + photo + '\'' +
                ", camera_id=" + camera_id +
                '}';
    }
}

