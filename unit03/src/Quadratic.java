//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(0, 0, 0);
		rootOne = rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.sqrt(Math.pow(b, 2.0) - 4.0 * a * c)) / 2.0 / a;
		rootTwo = (-b - Math.sqrt((Math.pow(b, 2.0)) - (4.0 * a * c))) / 2.0 / a;
	}

    public void print()
    {
    	System.out.printf("root one = " + "%.2f\n", rootOne);
    	System.out.printf("root two = " + "%.2f\n", rootTwo);
    	System.out.println("\n\n");
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "" + "root one = " + String.format("%.2f\n", rootOne) + "root two = " + String.format("%.2f\n", rootTwo);
	}
}