/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/** Nim : 13020200277
    Nama : Sherina Sugianto
    Hari, Tanggal : Rabu, 23 Maret 2022
    Waktu : 14:5 */

public class Asign {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        //BufferedInputStream awl = new BufferedInputStream(System.in);
        InputStreamReader awl = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(awl);
        String a;
        a = masukan.nextLine();
        System.out.print ("Nilai A = "+a); 
        }
}
