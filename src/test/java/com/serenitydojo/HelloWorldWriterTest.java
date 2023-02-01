package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {

        final int ageThisYear = 42; // Final makes it not modifiable. Cant do a ageThisYear = ageThisYear+23;
        int year = 2023;
        int ageNextYear = ageThisYear + 1;
        double weight = 15.5;
        float height = 51.23F;
        double height2 = 12.34;
        long height3 = 1000000000000L;

        year += 10;
        height += 12.34;

        System.out.println("Age this year : " + ageThisYear + " Age next year : " + ageNextYear);
        System.out.println("Weight : " + weight);
        System.out.println("Year : " + year);
        System.out.println("Height : " + height);
        System.out.println("Height2 : " + height2);
        System.out.println("Height3 : " + height3);

    }

    @Test
    public void workingWithStrings() {
        String firstName ="Sarah-Jane";
        String spacesName ="     Christian Jensen     ";
        String upperCaseName = firstName.toUpperCase();
        String lowerCaseName = firstName.toLowerCase();
        String replaceName  = firstName.replace("Sarah", "Charlotte");


        System.out.println(firstName);
        System.out.println(upperCaseName);
        System.out.println(lowerCaseName);
        System.out.println(replaceName);
        System.out.println("length of name : " + firstName.length());
        System.out.println("Trimmed name : " + spacesName.trim());
    }
}
