package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        //initialize object
        CalculateVolume Volume = new CalculateVolume();

        //initialize scanner and readers to allow for user input
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        Scanner sc = new Scanner(System.in);

        //initialize variables needed for while loop
        boolean cont = true;
        String ans;

        //initialize variables needed to for calculations
        double gx;
        double d1;
        double d2;
        double m;
        double b;
        double slice;
        double zero;

        System.out.println("This program calculates the volume of rotation for a linear function bound in the first quadrant");
        //describes the project to the user so that they have an understanding of how to properly use the program

        while (cont) {
            //while loop that continues until the user says that they want to stop

            System.out.println("For the function f(x) = mx + b please enter the m value");
            m = sc.nextDouble();
            //collects user input for the slope of the linear function

            //----------------------------------------------------------------------------------------------------------
            System.out.println("For the function f(x) = mx + b please enter the b value");
            b = sc.nextDouble();
            //collects user input for the vertical shift of the linear function

            if (m <= 0){
                while (b <= 0){
                    System.out.println("This function will not be in the first quadrant\n" +
                            "Please reenter you values");

                    System.out.println("For the function f(x) = mx + b please enter the m value");
                    m = sc.nextDouble();
                    //collects user input for the slope of the linear function

                    //--------------------------------------------------------------------------------------------------
                    System.out.println("For the function f(x) = mx + b please enter the b value");
                    b = sc.nextDouble();
                    //collects user input for the vertical shift of the linear function
                }//end while loop
            }//end if statement
            //This block of code above makes sure that if the slope is negative then the vertical shift is not negative

            //----------------------------------------------------------------------------------------------------------
            if (m != 0){
                zero = -b/m;
                //finds the zero of the equation

                if (m < 0){
                    System.out.println("Please have your domains less than or equal to: " + zero);
                }
                else if (zero < 0){
                    System.out.println("Please have your domains greater than or equal to: 0");
                }
                else {
                    System.out.print("Please have your domains greater than or equal to: "+ zero);
                }
            }
            else {
                zero = 0;
                System.out.println("Please have your domains greater than or equal to: 0");
            }



            //----------------------------------------------------------------------------------------------------------


            System.out.println("Please enter the lower value of the domain where the function is in the first quadrant");
            d1 = sc.nextDouble();
            System.out.println("Please enter the higher value of the domain where the function is in the first quadrant");
            d2 = sc.nextDouble();
            //collects user input for the values of the domain

            while (d1 >= d2 || d1 < 0) {
                if (d1 >= d2) {
                    System.out.println("The second value of the domain must be greater than the first");
                }//end of if statement
                //finds if the first and second domains are in the wrong order
                //if they are then prints out what the user did wrong
                else {
                    System.out.println("The first value of the domain must be greater than zero");
                    //if it isn't then prints out the other reason that the user could have messed
                }
                System.out.println("Please enter the lower value of the domain where the function is in the first quadrant");
                d1 = sc.nextDouble();
                System.out.println("Please enter the higher value of the domain where the function is in the first quadrant");
                d2 = sc.nextDouble();
                //asks the user to input the domain values again

            }//end of while loop
            //checks if the user enters invalid domain values (the first greater than the second or less than zero)
            //if either of these are true then they must reenter the values
            //the while loop runs until both of the criteria for the domain are successfully met


            //----------------------------------------------------------------------------------------------------------
            if (m < 0) {
                while (d1 >= zero || d2 > zero) {
                    System.out.println("Your domain must contain values only in the first quadrant");

                    //----------------------------------------------------------------------------------------------------------
                    System.out.println("Please enter the lower value of the domain where the function is in the first quadrant");
                    d1 = sc.nextDouble();
                    System.out.println("Please enter the higher value of the domain where the function is in the first quadrant");
                    d2 = sc.nextDouble();
                    //collects user input for the values of the domain

                    while (d1 >= d2 || d1 < 0) {
                        if (d1 >= d2) {
                            System.out.println("The second value of the domain must be greater than the first");
                        }//end of if statement
                        //finds if the first and second domains are in the wrong order
                        //if they are then prints out what the user did wrong
                        else {
                            System.out.println("The first value of the domain must be greater than zero");
                            //if it isn't then prints out the other reason that the user could have messed
                        }
                        System.out.println("Please enter the lower value of the domain where the function is in the first quadrant");
                        d1 = sc.nextDouble();
                        System.out.println("Please enter the higher value of the domain where the function is in the first quadrant");
                        d2 = sc.nextDouble();
                        //asks the user to input the domain values again

                    }//end of while loop
                    //checks if the user enters invalid domain values (the first greater than the second or less than zero)
                    //if either of these are true then they must reenter the values
                    //the while loop runs until both of the criteria for the domain are successfully met
                }//end of while loop
            }//end of if statement

            //----------------------------------------------------------------------------------------------------------
            if (b < 0) {
                while (d1 < zero || d2 <= zero){
                    System.out.println("Your domain must contain values only in the first quadrant");

                    //----------------------------------------------------------------------------------------------------------
                    System.out.println("Please enter the lower value of the domain where the function is in the first quadrant");
                    d1 = sc.nextDouble();
                    System.out.println("Please enter the higher value of the domain where the function is in the first quadrant");
                    d2 = sc.nextDouble();
                    //collects user input for the values of the domain

                    while (d1 >= d2 || d1 < 0) {
                        if (d1 >= d2) {
                            System.out.println("The second value of the domain must be greater than the first");
                        }//end of if statement
                        //finds if the first and second domains are in the wrong order
                        //if they are then prints out what the user did wrong

                        System.out.println("The first value of the domain must be greater than zero");
                        //if it isn't then prints out the other reason that the user could have messed

                        System.out.println("Please enter the lower value of the domain where the function is in the first quadrant");
                        d1 = sc.nextDouble();
                        System.out.println("Please enter the higher value of the domain where the function is in the first quadrant");
                        d2 = sc.nextDouble();
                        //asks the user to input the domain values again

                    }//end of while loop
                    //checks if the user enters invalid domain values (the first greater than the second or less than zero)
                    //if either of these are true then they must reenter the values
                    //the while loop runs until both of the criteria for the domain are successfully met
                }//end of while loop
            }//end of if statement

            //----------------------------------------------------------------------------------------------------------
            System.out.println("For the function g(x) please enter the value");
            gx = sc.nextDouble();
            //collects user input for the g(x) function

            //----------------------------------------------------------------------------------------------------------
            System.out.println("Please enter the number of iterations you would like");
            slice = sc.nextDouble();
            //collects user input for the number of iterations required

            Volume.SetRestrictions(d1, d2, gx, slice);
            //sets these values in the other class

            //----------------------------------------------------------------------------------------------------------
            System.out.println("The volume of the function f(x) between " + d1 + " and " + d2 +
                    " with the function g(x) as a restriction is: " + Volume.CalcVolume(m, b));
            //displays the calculated volume

            //----------------------------------------------------------------------------------------------------------
            System.out.println("Do you want to continue?");
            ans = br.readLine();
            //asks if the user wants to continue

            if (ans.equalsIgnoreCase("no")) {
                cont = false;
            }//end of if statement
            //if the user answers no then the while loop breaks and the program ends

            Volume.ResetVolume();
            //this resets the volume in the CalculateVolume class so that it does not add onto the previous calculation
            // if the user decides to continue
        }//end of while loop
    }//end of main
}//end of main class
