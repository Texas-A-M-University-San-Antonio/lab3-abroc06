/**
 * Name: Aidan Brockman
 * Date: 09/08/25
* Purpose: InClass 3 - 
* To output the volume and surface area of an object, dimensions given by the user upon runtime.
 */

import java.util.Scanner;

public class InClass3_Aidan_Brockman
{
    public static void main(String[] args) 
    {
        Scanner userIn = new Scanner(System.in); 
        double sideL, vol = 0.00, surfaceA = 0.00; //intial declaration of variables and scanner.

        System.out.println("Enter the length (m) of the side of the cube: ");
        sideL = userIn.nextDouble(); //intakes user input.

        vol =  Math.pow(sideL, 3);
        surfaceA = Math.pow(sideL, 2) * 6; // volume and surface area calculation and setting.

        System.out.printf("%nThe volume of the cube with side length %.0f meters is %.2f m^3, and the surface area is %.2f m^2. %n", sideL, vol, surfaceA);
        //formatted output including the requested calculations.
    }
}