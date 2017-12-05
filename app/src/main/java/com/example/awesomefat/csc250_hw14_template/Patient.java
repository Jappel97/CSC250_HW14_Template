package com.example.awesomefat.csc250_hw14_template;

import android.support.annotation.NonNull;

import java.util.Arrays;

/**
 * Created by awesomefat on 11/30/17.
 */

public class Patient extends Person implements Comparable<Patient>
{
    private double balance;

    public Patient(String firstName, String lastName, int age, String gender, double balance)
    {
        super(firstName, lastName, age, gender); //MUST be the first line in this constructor
        this.balance = balance;
    }

    public String toString()
    {
        return String.format("%s Balance: %f", super.toString(), this.balance);
    }

    public void patientSort(Patient[] people)
    {
        Arrays.sort(people);
    }

    @Override
    public int compareTo(@NonNull Patient thisGuy)
    {
        int compBalance = (int)thisGuy.balance;
        return (int)this.balance - compBalance;
    }
}
