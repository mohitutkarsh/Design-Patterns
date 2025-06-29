package com.Mohit.BuilderDesignPattern;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal(){
        mealBuilder.addCurry();
        mealBuilder.addBread();
        mealBuilder.addColdDrink();

        return mealBuilder.build();
    }
}
