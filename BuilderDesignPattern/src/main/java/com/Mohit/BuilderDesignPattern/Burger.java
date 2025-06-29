package com.Mohit.BuilderDesignPattern;

public class Burger {
    private int size;
    private boolean cheese;
    private String shape;

    private Burger(BurgerBuilder burgerBuilder){
    }

    public int getSize(){
        return size;
    }

    public boolean isCheese(){
        return cheese;
    }

    public String getShape(){
        return shape;
    }

    public static class BurgerBuilder{
        private int size;
        private boolean cheese;
        private String shape;

        public BurgerBuilder size(int size){
            this.size = size;
            return this;
        }

        public BurgerBuilder cheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder shape(String shape){
            this.shape = shape;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}
