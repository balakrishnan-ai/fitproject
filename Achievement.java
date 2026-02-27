package model;

import java.time.LocalDate;

public class Achievement {

    private int id;
    private int userId;
    private String title;
    private LocalDate date;

    public Achievement() {}

    public Achievement(int id, int userId, String title, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}