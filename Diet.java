package model;

import java.time.LocalDate;

public class Diet {

    private int id;
    private int userId;
    private String meal;
    private String food;
    private int calories;
    private LocalDate date;

    public Diet() {}

    public Diet(int id, int userId, String meal, String food,
                int calories, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.meal = meal;
        this.food = food;
        this.calories = calories;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getMeal() { return meal; }
    public void setMeal(String meal) { this.meal = meal; }

    public String getFood() { return food; }
    public void setFood(String food) { this.food = food; }

    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}