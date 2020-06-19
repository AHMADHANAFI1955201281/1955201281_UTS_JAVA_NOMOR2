/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerulanganCountedLoopDanUncountedLoop;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class While {
      public static void main(String[] args) {
        
        // membuat variabel dan scanner
        boolean jawaban = true;
        int perulangan = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while( jawaban ) {
            System.out.println("Apakah anda Mahasiswa UNU Blitar?");
            System.out.print("Jawab [ya/bukan]> ");
            
            jawab = scan.nextLine();
            
            // cek jawabannya, kalau ya berarti berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                jawaban = false;
            }
            
            perulangan++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + perulangan + "kali");
        }
    }

    
/*3)	While
Deskripsi Program :
Pada program Perulangan While Menentukan Mahasiswa UNU Blitar menggunakan fungsi scanner agar user dapat menginput nilai saat program sedang berjalan. Terdapat variabel perulangan dengan tipe data integer dan nilai awal adalah 0. Kemudian ada perulangan while dengan output System.out.println("Apakah anda Mahasiswa UNU Blitar?"); yang menampilkan kalimat "Apakah anda Mahasiswa UNU Blitar?" menampilkan output System.out.print("Jawab [ya/bukan]> "); yang memerintahkan user untuk mengimput kata “ya / bukan”. Dengan kondisi if( jawab.equalsIgnoreCase("ya") ){, syarat ini berarti jika nilai yang terdapat di dalam variabel perulangan menginputkanya bukan kata “ya” maka perulangan akan terus dilakukan sampai variabel bilangan harus kata “ya”. Perulangan dilakukan dengan mencetak kalimat “Apakah anda Mahasiswa UNU Blitar? Jawab [ya/bukan]> “dimana user akan memasukan kata , selama bilangan yang dimasukan oleh pengguna kata “ya” program ini akan terus diulang-ulang. Program akan berhenti ketika pengguna mamasukan kata “ya”.
*/