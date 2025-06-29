package com.Mohit.BuilderDesignPattern;

public class VegMealBuilder extends MealBuilder {
    private Meal meal;

    public VegMealBuilder(){
        meal = new Meal();
    }

    @Override
    public void addCurry(){
        this.meal.setCurry("Veg");
    }

    @Override
    public void addBread(){
        this.meal.setBread("Naan");
    }

    @Override
    public void addColdDrink(){
        this.meal.setColdDrink("Sprite");
    }

    @Override
    public Meal build(){
        return meal;
    }
}
