/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ScannerInputOutput {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int semester, ipk;

        // membuat scanner baru
        Scanner data = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Daftar Ulang Mahasiswa");
        System.out.print("Nama Mahasiswa : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = data.nextLine();
        // Tampilkan output lagi
        System.out.print("Alamat         : ");
        // menggunakan scanner lagi
        alamat = data.nextLine();

        System.out.print("Semester       : ");
        semester = data.nextInt();

        System.out.print("IPK            : ");
        ipk = data.nextInt();


        // Menampilkan output yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Semester       : " + semester  );
        System.out.println("IPK            : " + ipk);
        
        System.out.println("Terima Kasih Telah Melakukan Registrasi Daftar Ulang");
        System.out.println("Silahkan Mengisi KRS");
    }

} 
/*3)	Scanner
Deskripsi Program :
-	Pada program input output class Scanner ini kita menjalankan proses input dialog dengan memasukkan  variable nama yang akan mencetak output "Nama Mahasiswa : begitu juga variable selanjutnya. Setelah user menginputkan data mereka, maka program akan mencetak tampilan output yang sudah simpan di variable output berupa kalimat "Terima Kasih Telah Melakukan Registrasi Daftar Ulang".

Deskripsi Scource Code :
-	membuat deskripsi variable
String nama, alamat;
       int semester, ipk;
-	Scanner data = new Scanner (System.in);
data adalah suatu variabel bertipe Scanner.
new Scanner (System.in) untuk menciptakan suatu objek  bertipe Scanner.
-	Kelas Scanner berada pada paket java.util, maka sebelum menggunakan Kelas Scanner harus meng-impornya terlebih dahulu pada baris sebelum deklarasi class dengan sintaks : import java.util.Scanner  
-	System.out.print("Nama Mahasiswa : "); menampilkan output dilakukan pengimputan data oleh user
-	nama = data.nextLine(); menggunakan scanner untuk mendeteksi variabel
-	System.out.println("Terima Kasih Telah Melakukan Registrasi Daftar Ulang"); akan mencetak output berupa kalimat "Terima Kasih Telah Melakukan Registrasi Daftar Ulang"

*/