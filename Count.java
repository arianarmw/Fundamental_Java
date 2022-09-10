/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Count Using Math Operators
 * Course : Object Oriented Programming (OOP)
 */

package Praktikum3;

import java.util.Scanner;

public class Count {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		 int x, y, result;
		 char operators;
		 
		 System.out.println("Input your number: ");
		 x = keyboard.nextInt();
		 operators = keyboard.next().charAt(0);
		 y = keyboard.nextInt();
		 
		 if((x>=1 && x<=1000)&&(y>=1 && y<=1000)) {
			 switch(operators) {
			 	case '+' : result = x + y;
			 	System.out.println("Result = " +result); 
			 	break;
			 	
			 	case '-' : result = x - y;
			 	System.out.println("Result = " +result); 
			 	break;	
			 	
			 	case '*' : result = x * y;
			 	System.out.println("Result = " +result); 
			 	break;	
			 	
			 	case '/' : result = x / y;
			 	System.out.println("Result = " +result); 
			 		if(y == 0) {
			 			System.out.println("Undefined result!"); 
			 		}
			 		break;
			 	
			 	case '%' : result = x % y;
			 	System.out.println("Result = " +result); 
			 	break;
			 }
		 }
	}
}
