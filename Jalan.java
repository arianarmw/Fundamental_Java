/* Author : Ariana Rahmawati
 * Date   : September 10th 2022
 * Lesson : Buka Tutup Jalan
 * Course : Object Oriented Programming (OOP)
 */

package Praktikum3;

import java.util.Scanner;

public class Jalan {
	public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);
        String s = scanThis.nextLine();
        String[] arr = s.split(" ", 4);
        long[] i = new long[4];
        int x = 0;
        long res = 0;

        for (String a : arr) {
            i[x] = Long.parseLong(a);
            res += i[x];
            x += 1;
        }
        
        if ((res - 999999) / 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
	}
}