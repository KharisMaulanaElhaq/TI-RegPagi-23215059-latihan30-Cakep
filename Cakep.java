/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?");
        System.out.print("Jawab (Yoi/Enggak) : ");
        String jawaban = scanner.nextLine();
        
        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else ifyoi
         (jawaban.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid.");
        }
        
        scanner.close();
    }
}

