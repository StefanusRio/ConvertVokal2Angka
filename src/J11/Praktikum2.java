/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

/**
 *
 * @author susan
 */
import java.util.Scanner;
public class Praktikum2 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas: " + identitas);
        System.out.println("\nCovert Kalimat Alay Angka (Vokal ke Angka)\n");
    }
    private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
   
    }
    
}
