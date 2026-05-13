package com.tugas; 
import java.util.Scanner;

public class HitungLuasSegitiga {
    public static double hitung(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Alas: ");
        double a = input.nextDouble();
        System.out.print("Tinggi: ");
        double t = input.nextDouble();
        
        System.out.println("Hasil: " + hitung(a, t));
    }
}