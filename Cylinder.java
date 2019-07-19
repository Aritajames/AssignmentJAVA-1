package Assignment2;

import java.util.Scanner;

public class Cylinder {

//Scanner class is a class from the java.util (package) used to obtain the input of the primitive types likes
//int, String,.
//It is the easiest to read user input
//to read numeric values of a certain datatype XYZ, the function to use will be nextXYZ() e.g nextShort() to read short datatypes
//To read strings use the next line

        static void area(int radius, int height){
            int areacy = radius * radius * height * 22/7;
            System.out.println("The area is " + areacy);

        }


        public static void main(String[] args) {

            Scanner getInput = new Scanner(System.in);

            //Ask for name
            System.out.println("Enter name");
            String name = getInput.nextLine();

            //Give more information
            System.out.println("I want to calculate the area of a cylinder");
            System.out.println("Please enter the radius and height of the rectangle");

            //Ask for height
            System.out.println("radius");
            int radius = getInput.nextInt();

            //Ask for width
            System.out.println("height");
            int height = getInput.nextInt();

            //Print the area
            area(radius,height);


        }

    }


