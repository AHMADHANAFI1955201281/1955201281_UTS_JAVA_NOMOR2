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
public class PercabanganSwitchCase {
     public static void main(String[] args){
        Scanner masuk=new Scanner(System.in);
        int pilihan;
        System.out.print("Masukkan Kode Pilihan Fakultas  :");

        pilihan=masuk.nextInt();
        switch(pilihan) {
          case 1: 
                 System.out.println("Fakultas Ilmu Eksakta");
                 break;
          case 2: 
                 System.out.println("Fakultas Ilmu Sosial");
                 break;
          case 3: 
                 System.out.println("Fakultas Kedokteran");
                 break;
          case 4: 
                 System.out.println("Fakultas Kehutanan");
                 break;
          default: 
                 System.out.println("Pilihan Salah!!!");
}      
}
}
  /*3)	Percabangan Switch Case
Deskripsi Program :
Program diatas tentang pemilihan Fakultas dimana kita akan menggunakan class scanner agar memungkinkan user dapat menginput nilai saat program dijalankan. Nilai yang dimasukan oleh user akan disimpan pada variabel pilihan, kemudian nilai pilihan akan dibandingkan dengan setiap case yang ada pada struktur switch, jika ada salah satu case yang sama (bernilai true) maka pernyataan pada case tersebutlah yang dieksekusi.
Sebagai contoh jika pilihan yang saya masukan 3 adalah  maka pernyataan pada case ke 3  yang akan dieksekusi dengan menampilkan kata “Fakultas Kedokteran”
*/  


