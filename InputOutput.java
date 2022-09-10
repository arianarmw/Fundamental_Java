/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Input & Output (1)
 * Course : Object Oriented Programming (OOP)
 */

package Praktikum3;

import java.util.*;

public class InputOutput {
	static Scanner keyboard  = new Scanner(System.in); // make scanner
	public static void main(String[] args) {
		String s; //Kamus Data
		int n,k;
		
		System.out.println("\t----- Converter ------");
		System.out.println("\tEnter words : ");
		s = keyboard.nextLine();//inputan
		
		String[] stringarr = s.split("[@ ? !_ , . ']+");//make array of string untuk memisahkan string berdasarkan format ketentuan
		n = stringarr.length;//inisialisasi dengan jumlah token pada stringarr
		
		System.out.println("\tTotal words : "+n);//Print 
	    //Mencetak kata secara berurutan
		
		k = 1;
		for(int i=0; i < n; i++){
			System.out.println("\tWords " +k + " : "+stringarr[i]);
	        k = k +1;
	    }
	 }
}