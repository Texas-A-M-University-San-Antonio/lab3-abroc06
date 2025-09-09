//Name: Aidan Brockman
//Date: 09/08/25
//Lab3 for Programming Fundamentals I
import java.util.Scanner;

public class Lab3_Aidan_Brockman
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        double valInit, itRWhole, itRate, valFinal; //variable declarations and scanner intialization.
        int years;

        System.out.printf("Enter the initial value of the home, the time elapsed in years, and interest rate: %n");
        valInit = userIn.nextDouble();
        years = userIn.nextInt();
        itRWhole = userIn.nextDouble(); //user inputs collected.

        itRate = itRWhole/100;
        valFinal = valInit * Math.pow((1+itRate),years); //interest rate conversion and final value calculation

        System.out.printf("%nThe final value of the home is: $%,3.2f %n",valFinal);
    }
}