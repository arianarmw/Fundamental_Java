/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Big Number
 * Course : Object Oriented Programming (OOP)
 * 
 * Credits - GitHub @yanzv
 */

package Praktikum3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigNumber {
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("--- BIG NUMBER ---");
        System.out.println("Input your number here : ");
        
        String numOne = sc.nextLine();
        String numTwo = sc.nextLine();
        
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);

        System.out.println("Result first : " + bigNumOne.add(bigNumTwo));
        System.out.println("Result second : " +bigNumOne.multiply(bigNumTwo));
    }
}