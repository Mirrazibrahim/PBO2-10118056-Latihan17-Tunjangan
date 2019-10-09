/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118057.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class PBO210118057Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tunjangan = 0;
        // TODO code application logic here
        System.out.println("**********Program Tunjangan**********");
        System.out.print  ("Berapa gaji anda perbulan?\t: Rp.");
        Scanner scanner = new Scanner(System.in);
        double gaji = scanner.nextDouble();
        
        System.out.print("Status anda? (Menikah/Belum)\t: ");
        String status = scanner.next();
        
        System.out.println("=======Hasil Perhitungan gaji anda=======");
        System.out.println("Gaji Pokok\t:"+gaji);
        if (status.equalsIgnoreCase("menikah")){tunjangan = (int) (0.35*gaji);
        } else{ 
            tunjangan=0;
        }
        System.out.println("Tunjangan\t:" + tunjangan);
        System.out.println("Total Gaji\t:" + (gaji+tunjangan));
        System.out.println("(Developed by : Mirraz ibrahim)");
    }
    
}
