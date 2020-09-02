package com.company.Animals;

import java.time.LocalDate;

public class Reservor {

    private String Name;
    private LocalDate ReservedAt;

    public String getName() { return Name; }

    public LocalDate getReservedAt() { return ReservedAt; }

    public void setName(String name) {this.Name = name;}


    public Reservor(String name, LocalDate reservedAt) {
        Name = name;
        ReservedAt = reservedAt;
    }

}
