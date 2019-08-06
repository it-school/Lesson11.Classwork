package com.itschool.Classes;

public class Meal {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public boolean setCalories(String calories) {
        boolean result = false;
            try {
                this.calories = Integer.valueOf(calories);
                result = true;
            } catch (Exception e) {
                result = false;
            }
        return result;
    }

    public int getMinutesToCook() {
        return minutesToCook;
    }

    public void setMinutesToCook(int minutesToCook) {
        this.minutesToCook = minutesToCook;
    }

    String title;
    String description;
    int calories;
    int minutesToCook;

    public Meal(String title, String description, String calories, int minutesToCook)
    {
        this.title = title;
        this.description = description;
        this.setCalories(calories);
        this.minutesToCook = minutesToCook;
    }

    @Override
    public String toString() {
        return title + "{description='" + description + '\'' +
                ", calories=" + calories +
                ", minutesToCook=" + minutesToCook +
                '}';
    }
}
