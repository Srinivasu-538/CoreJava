package com.dl.one;
import java.util.Scanner;
public class Eg4{
    public static void main(String[] args)
{
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter Temperature in celcius : ");
//    double celsius = scan.nextDouble();
//    double fahrenheit = (celsius * 9/5) + 32;
//    
//    System.out.println("The temperature in fahrenheit : " + fahrenheit+ "°f");
//    
//     scan.close();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the weight of the body : ");
    	double weight = scan.nextDouble();
    	
    	System.out.println("Enter the height of the body : ");
    	double height = scan.nextDouble();
    	
        double bmi = weight/(height*height);
    	System.out.println("bmi of the body is : "+bmi +"kg/m^2");
    	scan.close();
    	
}
}