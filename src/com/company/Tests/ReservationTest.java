package com.company.Tests;

import com.company.Animals.Gender;
import com.company.Reservation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

private Reservation reservation;

    @Test
    void TestNewCat() {
        reservation = new Reservation();
        assertEquals(0, this.reservation.animals.size());
        this.reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
        assertEquals(1, this.reservation.animals.size());
    }
}