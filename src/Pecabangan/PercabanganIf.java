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

public class PercabanganIf {
    
    public static void main(String[] args) {
        
        //membuat variabel aktif dan scanner
        int penelitian = 0;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.print(" Berapa Kali Anda Membuat Jurnal Ilmiah/ penelitian Ilmiah : ") ;
        penelitian = scan.nextInt();
          
        //cek apakan mahasiswa mempunyai jumlah persentase kehadiran diatas 10
        if ( penelitian > 10 ){
            System.out.println("Selamat, Anda Termasuk Mahasiswa AKTIF melakukan Program Penelitian ");
          
            }
        {
                                     
        System.out.println("Terima Kasih Sudah Mengakses Program Ini");
    }
    }
}
/*1)	Percabangan If
Deskripsi Program :
Program keaktifan melakukan Penelitian dengan nama class PercabanganIf. 
Class adalah suatu ‘blue print’ untuk menciptakann instatnce dari suatu object. Program dibuat pada fungsi utama main(), dimana kita inisilisasi variabel penelitian menggunakan tipe data integer dengan nilai 0.
Kemudian terdapat percabangan IF dengan kondisi penelitian > 10 ? jika kondisi tersebut benar (true) maka pernyatataan untuk mencetak output “Selamat, Anda Termasuk Mahasiswa AKTIF melakukan Program Penelitian” akan di eksekusi. Sementara jika kondisi salah (false) program tidak mengerjakan perintah apapun.
*/