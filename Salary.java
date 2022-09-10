/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Count Salary
 * Course : Object Oriented Programming (OOP)
 */

package Praktikum3;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		int BasicSalary = 500000;
		int SalaryCut = 0;
		int Bonus = 0;
		int TotalSales = 0;
		int ItemSold = 0;
		int NetSalary = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("---- Salary Calculator ----");
		System.out.println("\n");
		System.out.println("Enter the number of items sold : ");
		
		ItemSold = sc.nextInt(); 
		TotalSales = ItemSold * 50000; 
		
		if(ItemSold < 15) {
			/* 
            jika item yang terjual kurang dari 15 maka akan mendapat potongan 15% dari total kekurangan */
			SalaryCut = (15*(750000 - TotalSales))/100;
            NetSalary = BasicSalary - SalaryCut;
		} else if (ItemSold >= 15 && ItemSold < 40) {
			 /* jika item yang terjual kurang dari 40 maka akan mendapat bonus 10% dari penjualan item*/
			Bonus = (10*TotalSales)/100;
            NetSalary = BasicSalary + Bonus;
		} else if (ItemSold >= 40 && ItemSold <= 80) {
			 /* jika item yang terjual kurang dari 81 maka akan mendapat bonus 25% dari penjualan item */
			Bonus = (25*TotalSales)/100;
            NetSalary = BasicSalary + Bonus;
		} else if (ItemSold > 80) {
			 /* jika item yang terjual lebih dari 80 maka akan mendapat bonus 35% dari penjualan item*/
			Bonus = (35*TotalSales)/100;
            NetSalary = BasicSalary + Bonus;
		}
		System.out.println("The salary you get : " +NetSalary + "\nCongratulations!");
	}
}
