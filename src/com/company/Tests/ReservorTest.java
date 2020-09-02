package com.company.Tests;

import com.company.Animals.Reservor;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservorTest {

    @Test
    void TestConstructor() {
        LocalDate reservedAt = LocalDate.now();
        Reservor reservor = new Reservor("John Doe", reservedAt);
        assertEquals("John Doe", reservor.getName());
        assertEquals(reservedAt, reservor.getReservedAt());
    }
}