/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_str;

import java.util.Scanner;
import static tugas_str.Tugas_STR.nama;

/**
 *
 * @author Bayu
 */
public class bayu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String kata;
        int n, i=1;
        System.out.print("Masukan kata : ");
        kata = input.next();
        n = kata.length();
        System.out.println("---------------------------");
        ulang(kata, n, i);
        
    }
    public static void ulang (String k, int n, int i){
        if (n>=i){
            System.out.println(k);
            i++;
            ulang(k, n, i);
        }else{
            System.out.println("---------------------------\nSELESAI");
        }
    }
}
