package com.company.Animals;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dog extends Animal {

    private LocalDate LastWalk;
    //private DateTimeAtCompleted date;

    public static int countDog;

    public Dog(String name, com.company.Animals.Gender gender) {
        super(name, gender);
        this.LastWalk = LocalDate.now();

    }

    public boolean NeedsWalks() {
        return LocalDate.now().compareTo(LastWalk) > 0;
    }

//    public void DogPrice(ArrayList dogs){
//
//    }

    public String ToString()
    {
        return super.ToString() + this.LastWalk.toString();
    }
}
