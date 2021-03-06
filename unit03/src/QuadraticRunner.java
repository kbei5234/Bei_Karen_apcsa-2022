//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		//add test cases 
		Scanner myScanner = new Scanner(System.in);
		
		// test 1
		int a, b, c;
		System.out.println("Enter a: ");
		a = myScanner.nextInt();
		System.out.println("Enter b: ");
		b = myScanner.nextInt();
		System.out.println("Enter c: ");
		c= myScanner.nextInt();
		
		Quadratic test1 = new Quadratic(a, b, c); // cannot use default constructor bc all values 0 -> return NaN
		test1.calcRoots();
		test1.print();
		
		// test 2
		System.out.println("Enter a: ");
		a = myScanner.nextInt();
		System.out.println("Enter b: ");
		b = myScanner.nextInt();
		System.out.println("Enter c: ");
		c= myScanner.nextInt();
		
		Quadratic test2 = new Quadratic(a, b, c);
		test2.calcRoots();
		System.out.println(test2.toString()); 
		
		// test 3
		System.out.println("Enter a: ");
		a = myScanner.nextInt();
		System.out.println("Enter b: ");
		b = myScanner.nextInt();
		System.out.println("Enter c: ");
		c= myScanner.nextInt();
		
		Quadratic test3 = new Quadratic(a, b, c);
		test3.calcRoots();
		System.out.println(test3.toString()); 
	}
}