/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class PercabanganIfElse {
    public static void main(String[] args) {
        
        //membuat variabel wisuda dan scanner
        int ipk;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.print(" Nama : ") ;
        nama = scan.nextLine();
        System.out.print(" IPK : ") ;
        ipk = scan.nextInt();
        
        //cek apakan mahasiswa memraih gelar CUMLAUDE
        if ( ipk >= 3.75 ){
            System.out.println("Selamat " + nama + " Anda Termasuk Mahasiswa yang Bergelar CUMLAUDE");
        
        } else   {
            System.out.println("Maaf " + nama + " Anda Belum Meraih Gelar CUMLAUDE ");
        }              
    }
}
/*2)	Percabangan If Else
Deskripsi Program :
Program mahasiswa bergelar cumlaude terdapat variabel ipk dengan nilai >= 3.75. Kemudian ada percabangan IF dengan kondisi apakah nilai ipk adalah >=3.75 ? Jika benar maka tampilkan kalimat "Selamat " + nama + " Anda Termasuk Mahasiswa yang Bergelar CUMLAUDE" namun jika salah tampilkan "Maaf " + nama + " Anda Belum Meraih Gelar CUMLAUDE ". Dari contoh ini dapat kita lihat dengan sederhana bahwa nilai ipk adalah lebih atau sama dengan 3.75 apabila kurang dari  3.75 sehingga kondisi bernilai salah (false) maka pernyataan yang di eksekusi adalah pada bagian ELSE yaitu menampilkan kalimat "Maaf " + nama + " Anda Belum Meraih Gelar CUMLAUDE ".
*/

