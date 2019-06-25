package tugas_str;

import java.util.Scanner;

public class Tugas_STR {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i;
        int nilai;
        System.out.print("Masukan awal  : ");
        i = input.nextInt();
        System.out.print("Masukan akhir : ");
        nilai = input.nextInt();
        nama (nilai, i);
    }

    public static void nama(int b, int i) {
        if (b>=i){
            if (b>i){
                System.out.print(i+" ");
                i++;
                nama (b, i);
            }else{
                i++;
                System.out.print(i-1+" ");
            }
        }else if (i>b){
            
            if (i>b){
                System.out.print(i+" ");
                i--;
                nama (b, i);
            }else{
                i--;
                System.out.print(i+" ");
            }
        }   
    }
    
    
}
