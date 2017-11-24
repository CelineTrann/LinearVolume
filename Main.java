package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    //for user input
    public static void main(String[] args)throws Exception {


        //initiate readers to allow for uses input
        Scanner sc = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        //initiate object
        CalcVolume volume = new CalcVolume();

        //initiate variables for function
        double m;
        double b;
        double gx;
        double d1;
        double d2;
        double iteration;

        //variable to see if user want to continue
        boolean cont = true;
        String ans;

        while (cont){
            //prompts and get values for linear function
            System.out.println("For the function: f(x) = mx = b \n" +
                    "What is your m value?");
            m = sc.nextDouble();

            System.out.println("\nWhat is your b value?");
            b = sc.nextDouble();

            //----------------------------------------------------------------------------------------------
            //ask for lower vertical restrictions (x = a value)
            System.out.println("What is your lower h. restriction?\n " +
                    "(Must be greater than or equal to 0)");
            d1 = sc. nextDouble();

            //ask for higher vertical restrictions ( x = a value)
            System.out.println("What is your higher h. restriction?");
            d2 = sc.nextDouble();

            //while loop that will continue until the parameters for the v. restriction s are met
            while  (d1 < 0 || d1 >= d2){

                //print out the error in their restriction
                if (d1 < 0){
                    System.out.println("Your lower h. restriction must be greater than or equal to 0");
                }else{
                    System.out.println("Your higher h. restriction must be greater than the lower h. restriction");
                }//close if-else statement

                //ask for lower vertical restrictions (x = a value)
                System.out.println("What is your lower h. restriction?\n " +
                        "(Must be greater than or equal to 0)");
                d1 = sc. nextDouble();

                //ask for higher vertical restrictions (x = a value)
                System.out.println("What is your higher h. restriction?");
                d2 = sc.nextDouble();

            }//close while loop

            //----------------------------------------------------------------------------------------------
            //ask for horizontal restriction
            System.out.println("What is your v. restriction?");
            gx = sc.nextDouble();

            //----------------------------------------------------------------------------------------------
            System.out.println("How many iterations do you want to use?");
            iteration = sc.nextDouble();

            //----------------------------------------------------------------------------------------------
            //set restriction values in CalcVolume Class
            volume.setRestricitons(d1, d2, gx, iteration);

            //states what the volume function
            System.out.println("The volume is:" + volume.calculate(m, b));

            //----------------------------------------------------------------------------------------------
            //ask if use wants to continue
            System.out.println("Do you wish to continue?");
            ans = br.readLine();

            //if they want to program will close
            //will end while loop
            if (ans.equalsIgnoreCase("no")){

                cont = false;

            }//close if statement

            //----------------------------------------------------------------------------------------------
            //reset user set restrictions
            volume.resetData();

        }//close while statement
    }//closes main function
}//closes main class
