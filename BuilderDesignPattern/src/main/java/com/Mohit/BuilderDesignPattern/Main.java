package com.Mohit.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                                    .size(5)
                                    .cheese(true)
                                    .shape("Round")
                                    .build();

        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();

        System.out.println("Burger is :" + burger);
        System.out.println("Meal is :" + meal);
    }
}
