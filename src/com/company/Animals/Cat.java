package com.company.Animals;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {

    private String BadHabits;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        BadHabits = badHabits;
    }

    public String ToString() {
        return super.ToString() + String.format("bad habits:", BadHabits.toLowerCase());
    }

    public Boolean MaximumPrice(String badHabits) {

        var totalCountPriceAnimal = CalculateCountBadHabit(badHabits);
        var maxPrice = 350;
        var minPrice = 35;

        var totalPrice = maxPrice - totalCountPriceAnimal;

        if (totalPrice > maxPrice || totalPrice < minPrice) {
            String.format("To High or to Low");
            return false;
        } else {
            String.format("Perfect");
            return true;
        }

    }

    public int CalculateCountBadHabit(String habits) {
        var length = habits.length();
        var total = length * 20;
        return total;
    }
}
