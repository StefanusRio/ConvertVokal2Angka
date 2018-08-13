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
import java.util.Locale;
public class Praktikum1 {
public static void main(String[] args){
    String identitas = "Stefanus Ario Prabowo / X RPL 3 / 37";
    System.out.println("Identitas: " + identitas);
    
    String x = "Operasi";
    System.out.println("Isi variabel x : " + x);
    System.out.println("\"" + x + "\" panjang karakter = "+ x.length());
    
    System.out.println("x adalah kosong : " + x.isEmpty());
    
    String y ="";
    System.out.println("Isi variabel y : " + y);
    System.out.println("y adalah kosong : " + y.isEmpty());
    
    System.out.println("Isi x sama dengan y : " + x.equals(y));
    
    String z = "Operasi";
    
    System.out.println("Isi variabel z : " + z);
    System.out.println("Isi x sama dengan z z (Case Sensitive) : " + x.equals(z));
    
    String r = "Operasi";
    System.out.println("Isi variabel r : " + r);
    System.out.println("Isi x sama dengan r (Case Sensitive) : " + x.equals(r));
    System.out.println("Isi x sama dengan z (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
}    
}
