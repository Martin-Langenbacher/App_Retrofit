package com.example.app_retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private Integer id; // because it will be null if we are not using it and then it will get ignored!
    private String title;

    @SerializedName("body")
    private String text;


    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    // getter
    public int getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
