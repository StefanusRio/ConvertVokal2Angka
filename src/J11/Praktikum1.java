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
    
    System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
    System.out.println("Perbandingan isi x dengan z (Case Sensitive) : " + x.compareTo(z));
    System.out.println("Perbandingan isi x dengan r (Case Sensitive) : " + x.compareTo(r));
    System.out.println("Perbandingan isi x dengan r (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
    
    String s = "Operasi";
    System.out.println("Isi variabel s : " + s);
    System.out.println("Perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
    
    System.out.println("Pada x terdapat huruf 'a' : " + x.contains("a"));
    
    System.out.println("Isi variabel x besar semua : " + x.toUpperCase());
    System.out.println("Isi variabel x kecil semua : " + x.toLowerCase());
    
    String t = " Operasi String ";
    System.out.println("Isi variabel t : \""+ t + "\"");
    System.out.println("Isi variabel t tanpa spasi : \""+ t.trim() + "\"");
    
    System.out.println("Gabungkan isi variabel x dan r : "+ x.concat(r));
    
    System.out.println("Karakter mulai posisi 3 di variabel x : " + x.substring(3));
    
    System.out.println("Karakter dari posisi 3-5 di varibel x : " + x.substring(3,6));
    
    String tclean = t.trim();
    System.out.println("Isi variabel tclean : "+ t.trim());
    System.out.println("Rubah 'i' jadi 'E' di variabel tclean : " + tclean.replace("i", "E"));
    
    String[] arrT = tclean.split(" ");
    System.out.println("Pecah kata di variabel tclean : ");
    for (int i = 0; i < arrT.length; i++) {
        System.out.println(arrT[i]);
    
    String[] arrTr = tclean.split("r");
    System.out.println("Pecah kata berdasarkan huruf 'r' di variabel tclean : ");
    for (int j = 0; j < arrTr.length; j++) {
        System.out.println(arrTr[i]);;
                }
    double d = 1545454000;
        System.out.println(String.format("Uang saya %,.4f",d));
        
        System.out.println(String.format(Locale.forLanguageTag("in-ID"), "Uang saya Rp %,.2f", d));
}
}    
}
