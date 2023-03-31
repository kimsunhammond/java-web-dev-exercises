package org.launchcode.java.studios.areaofacircle;

//1. Ask the user for the radius
//2. Calculate the area
//3. Print the result to the screen

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        //place what you want to run here
        //create a new instance of the class you want to run here
        Area area = new Area();
        area.calculateArea();
    }
    //Declare class variables here


    //create constructors here
    public Area() {

    }
    //create other methods here

    public void calculateArea() {
        //ask for the radius
        Scanner input = new Scanner(System.in);
        System.out.println("What is your radius?");
        //what is the data type of the radius (Scanner info coming in)?
        Double myRadius = input.nextDouble();

        //calculate area
        //area = pi * radius * radius
        Double area = 3.14 * myRadius * myRadius;

        //print the result
        System.out.println(area);

    }
}
