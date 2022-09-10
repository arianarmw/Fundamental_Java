/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Input & Output (2)
 * Course : Object Oriented Programming (OOP)
 */

package Praktikum3;

import java.util.Scanner;

public class InputOutput2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----- Combine -----");
		System.out.println("Enter string and integer here : ");
		
		for(int i=0;i<3;i++){
			String String1=sc.next();
			int x=sc.nextInt();
		    System.out.printf("%15s%03d%n", String1, x);
		}
		System.out.println("================================");
		}
}