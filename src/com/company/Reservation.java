package com.company;

import com.company.Animals.Animal;
import com.company.Animals.Cat;
import com.company.Animals.Dog;
import com.company.Animals.Gender;

import java.util.*;

public class Reservation {

    public List animals = new ArrayList<Animal>();

    public void NewCat(String name, Gender gender, String badHabits)
    {
        this.animals.add(new Cat(name, gender, badHabits));
    }

    public void NewDog(String name, Gender gender)
    {
        this.animals.add(new Dog(name, gender));
    }


}
