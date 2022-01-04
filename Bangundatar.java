/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bangundatar {
    public double persegi(double s) 
{
//       Scanner input = new Scanner(System.in);
       double luas,keliling;
       System.out.println("\n-> Persegi <-");
       System.out.println("Masukkan Sisi : ");
//       s=input.nextInt();
       System.out.println("=>");
       luas = s * s;
       keliling = 4*s;
       System.out.print("Luas = " + (int)luas + "\nKeliling  = "+ (int)keliling);
       System.out.println("");
       return luas;
}
public double p_panjang(double p, double l)
 {
        Scanner input = new Scanner(System.in);
        double luas,keliling;
        System.out.println("\n–> Persegi Panjang <–");
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
         System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        System.out.println("=>");
        luas = p*l;
        keliling =  2*(p + l);
        System.out.print("Luas  = " + (int)luas + "\nKeliling  = "+ (int)keliling);
        System.out.println("");
        return luas;
        }
    public double lingkaran(double r, double phi)
    {
        Scanner input = new Scanner(System.in);
        double luas,keliling;
        System.out.println("\n–> Lingkaran <–");
        System.out.print("Masukkan Jari-jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        luas = phi * r * r;
        keliling = 2 * phi * r;
        System.out.print("hasil  = " + (int)luas +"\nrata = "+ (int)keliling);
        System.out.println("");
        return luas;
    }
 public double segitiga(double a, double t)
 {
     Scanner input = new Scanner(System.in);
     double luas,keliling;
     System.out.println("\n->Segitiga<-");
     System.out.println("Masukkan Alas : ");
//     a = input.nextDouble();
     System.out.println("Masukkan Tinggi : ");
//     t = input.nextDouble();
     System.out.println("=>");
     luas = 0.5 * a * t ;
     keliling = 3*t ;   
     System.out.print("hasil = " + (int)luas +"nrata ="+ (int)keliling);
     System.out.println("");
     return luas;
 }
 public static void main(String[] args) {
  System.out.println("hi");
  Bangundatar bd = new Bangundatar();
  System.out.println(bd.persegi(10));
  System.out.println(bd.segitiga(3, 15));
  System.out.println(bd.p_panjang(5, 6));
  System.out.println(bd.lingkaran(3, 3.14));
  
}
}