/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Ketupat {
    public static void main(String[] args) {	

	Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int bintang = x.nextInt();
        for (int jmlbris = 0; jmlbris <= bintang - 1; jmlbris++) {
            for (int j = 1; j <= bintang - jmlbris; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * jmlbris; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= bintang - jmlbris; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int jmlbris = 2; jmlbris <= bintang; jmlbris++) {
            for (int a = 1; a <= jmlbris; a++) {
                System.out.print(" ");
            }
            for (int b = jmlbris; b <= bintang * 2 - jmlbris; b++) {
                System.out.print("*");
            }
            for (int a = 1; a <= jmlbris; a++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
