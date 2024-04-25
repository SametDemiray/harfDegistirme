package org.example;

// Klavyeden girilen bir cümlede ; belirtilen karakteri, yeni değeriyle değiştirip ( Microsoft Word'te "Düzen" menüsündeki "Değiştir"
//seçeneği) yeniden yazdıran program


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String c;
        char h,y;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Cümleyi Giriniz : ");
        c = scanner.nextLine();
        System.out.print("\nDeğiştirilecek Harfi Giriniz : ");
        h = scanner.nextLine().charAt(0);
        System.out.print("Harfin yeni Değerini Giriniz : ");
        y = scanner.nextLine().charAt(0);
        System.out.println("\n Yeni Cümle = " + c.replace(h,y));
    }
}