package com.company.Animals;

import java.time.LocalDate;

 public abstract class Animal {
    private String Name;
    public Reservor ReservedBy;
    private Gender Gender;

    public Animal(String name, Gender gender) {
        Name = name;
        Gender = gender;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        Gender = gender;
    }

    public Reservor getReservor() {
        return ReservedBy;
    }

    public void setReservor(Reservor reservor) {
        ReservedBy = reservor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }


    public boolean Reserve(String reservedBy) {
        if (this.ReservedBy == null) {
            this.ReservedBy = new Reservor(reservedBy, LocalDate.now());
            return true;
        }
        return false;
    }

    public String ToString() {
        String reserved = "not reserved";
        if (this.ReservedBy != null) {
            reserved = String.format("reserved by", this.ReservedBy.getName());
        }
        return String.format(this.Name, this.Gender, this.ReservedBy);
    }

}
