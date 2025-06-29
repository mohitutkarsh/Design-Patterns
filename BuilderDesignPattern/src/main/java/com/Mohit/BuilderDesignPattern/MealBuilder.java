package com.Mohit.BuilderDesignPattern;

public  abstract class MealBuilder {
    public abstract void addCurry();
    public abstract void addBread();
    public abstract void addColdDrink();

    public abstract Meal build();
}
