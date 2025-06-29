package com.Mohit.BuilderDesignPattern;

public class NonVegMealBuilder extends MealBuilder{
    private Meal meal;

    public NonVegMealBuilder(){
        meal = new Meal();
    }

    @Override
    public void addCurry(){
        this.meal.setCurry("Non veg");
    }

    @Override
    public void addBread(){
        this.meal.setBread("Garlic naan");
    }

    @Override
    public void addColdDrink(){
        this.meal.setColdDrink("Coke");
    }

    @Override
    public Meal build(){
        return meal;
    }
}
