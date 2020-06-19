/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    



    public static void main(String[] args) throws IOException {

        String awal,nama,nim;
     

        // Membuat objek inputstream
        InputStreamReader input = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader data = new BufferedReader(input);

        // Mengisi varibel AWAL, nama dan NIM dengan Bufferreader
        System.out.print("INPUTKAN DATA DIBAWAH INI DENGAN BENAR (tekan enter)   ");
        awal = data.readLine();
        System.out.print("Nama (sesuai ijazah sebelumnya)  : ");
        nama = data.readLine();
        System.out.print("NIM                              : ");
        nim = data.readLine();
        // tampilkan output isi variabel nama dan NIM
        System.out.println("Pastikan Data Nama Anda " + nama + "  dan NIM " + nim + " Sudah Sesuai Dengan KTM ");

    }

}
/*1)	Buffer reader 
Deskripsi Program :
Pada program input output class BufferedReader ini kita menjalankan proses input dengan memasukkan  variable nama yang akan mencetak output “Nama (sesuai ijazah sebelumnya) :”, dan variable nim yang akan mencetak ouput “NIM :” , setelah user menginputkan data mereka, maka program akan mencetak tampilan output berupa gabungan variable nama dan nim "Pastikan Data Nama Anda " + nama + "  dan NIM " + nim + " Sudah Sesuai Dengan KTM "

Deskripsi Source Code :
-	Pada Class BufferedReader kita harus mengkonveksikan terlebih dahulu sebelum membuat  variabel yang akan digunakan.
-	Pada :
import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException; 
menyatakan bahwa kita akan menggunakan kelas BufferedReader, InputStreamreader, danIOException yang berada pada java.io package.

-	BufferedReader data = new BufferedReader (new InputStreamReader (System.in)); 

-	System.out.print("Nama (sesuai ijazah sebelumnya)  : ");
Statement ini menyatakan bahwa kita mendeklarasikan variabel bernama data dengan tipe kelas BufferedReader. menjalankan proses input dengan memasukkan  variable nama  yang akan mencetak output “Nama (sesuai ijazah sebelumnya) :” begitu pula variable selanjutnaya.
-	System.out.println("Pastikan Data Nama Anda " + nama + "  dan NIM " + nim + " Sudah Sesuai Dengan KTM "); akan mencetak output berupa gabungan variable nama dan nim.
*/
