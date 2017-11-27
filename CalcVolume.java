package com.company;

/**
 * Created by 84674tra on 15/11/2017.
 */
public class CalcVolume {
    //initiates restrictions for calculations
    private double d1;
    private double d2;
    private double gx;
    private double slice;

    //initiate volume variable
    private double volume;

    //----------------------------------------------------------------------------------------------
    //set the restrictions users set
    public void setRestricitons(double domain1, double domain2, double vr, double iterations) {
        d1 = domain1;
        d2 = domain2;
        gx = vr;
        slice = iterations;
    }//close setRestrictions Functions

    //----------------------------------------------------------------------------------------------
    //reset data of restrictions
    public void resetData(){
        d1 = 0;
        d2 = 0;
        gx = 0;
        slice = 0;
        volume = 0;
    }//close resetData function

    //----------------------------------------------------------------------------------------------
    //initiates calculate function with variable for functions: y = mx + b
    //calculates the volume of "cylinder" created when the linear function is rotated around the y-axis
    public double calculate (double m, double b){

        //calls private method that calculate variable
        Volume(m, b);

        //returns volume of linear function
        return volume;

    }//closes calculate funtions


    private void Volume (double m, double b){
        //initiates variables used to calculated volume
        double x;
        double thickness;
        double height;
        double width;

        for (int i = 0; i < slice; i++ ){
            //calculate the width of each iterative slice
            //calculated by dividing the horizontal range by the number of iterations
            thickness = (d2 - d1)/slice;

            //allow the current iteration to be accounted for in the volume calculation
            //calculates what the x-value is at that point in the iteration
            x = d2 - thickness*i;

            //what the height of said iteration is at the x -value
            //height of the "cylinder" and will become height of rectangular prism
            //uses linear eqn and subtract the g(x) value
            height = m * x + b - gx;

            //calculates the circumference of the cylinder
            //this will be used as the width of the rectangular prism
            width = 2*Math.PI*x;

            //calculate the volume of each iteration and adds it to the overall volume
            //does so by calculating the volume of a rectangular prism
            //which is created by "peeling" the outer of the "cylinder" off
            //which is created when the linear function is rotated around the y-axis
            volume += Math.abs(width*height*thickness);

        }//closes for loop
    }

}//closes calcVolume class
