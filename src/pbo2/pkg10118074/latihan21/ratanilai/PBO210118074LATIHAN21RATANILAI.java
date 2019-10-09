/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan21.ratanilai;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN21RATANILAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
        int n,jml,nilai[];
        float rata,jumlah=0;
        
        
        System.out.println("Masukan Banyaknya mahasiwa : ");
        n=input.nextInt();
        
        nilai = new int[n];
        
        for (int i=0;i<= n-1; i++){
            System.out.println("Nilai mahasiswa ke- " + (i+1)+":");
            nilai[i]=input.nextInt();
            
           
    
        }
        for (int j=0;j<= n-1; j++){
            jumlah=jumlah +nilai[j];
        }
        rata=jumlah/n;
        
        System.out.println("");
        System.out.println("Maka Rta-rata Nilai nya adalah" + rata);
        System.out.println("developed by Fikri");
    }
      
}
    
    

