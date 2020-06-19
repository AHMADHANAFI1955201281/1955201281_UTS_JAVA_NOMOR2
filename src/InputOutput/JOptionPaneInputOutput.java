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
import javax.swing.JOptionPane;
public class JOptionPaneInputOutput {
    
public static void main(String[] args) {
 // Input Nama
 String nama = JOptionPane.showInputDialog("MASUKKAN NAMA MAHASISWA");
 int nim =Integer.parseInt(JOptionPane.showInputDialog("MASUKKAN NIM ANDA"));
 // Print
 System.out.println("Mahasiswa Atas Nama " + nama + ", Dengan NIM " + nim + " Data Anda Sudah Kami simpan, Terima Kasih");
 }
}  
/*2)	J Option Pane
Deskripsi Program :
Pada program input output class JOptionPane ini kita menjalankan proses input dialog dengan memasukkan  variable nama yang akan mencetak output ("MASUKKAN NAMA MAHASISWA :”, dan variable nim yang akan mencetak ouput ("MASUKKAN NIM ANDA");, setelah user menginputkan data mereka, maka program akan mencetak tampilan output berupa gabungan variable nama dan nim ("Mahasiswa Atas Nama " + nama + ", Dengan NIM " + nim + " Data Anda Sudah Kami simpan, Terima Kasih");
Deskripsi Source Code
-	Menggunakan JOption yang didapatkan dari javax.swing package. dengan menggunakan JOption ini dapat mempermudah dengan memunculkan dialog box yang memberikan kepada user sebuah nilai atau menginformasikan sesuatu .

-	 import javax.swing.JOptionPane;
Menyatakan bahwa kita mengimport kelas JOptionPane dari javax.swing package.
-	String nama = JOptionPane.showInputDialog ("MASUKKAN NAMA MAHASISWA"); membuat sebuah JOption input dialog yang akan menampilkan dialog dengan sebuah pesan untuk menginputkan nama mahasiswa serta menampilkan tombol OK dan CANCEL.
-	int nim =Integer.parseInt(JOptionPane.showInputDialog("MASUKKAN NIM ANDA"); membuat sebuah JOption input dialog yang akan menampilkan dialog dengan sebuah pesan untuk menginputkan NIM serta menampilkan tombol OK dan CANCEL.
-	System.out.println("Mahasiswa Atas Nama " + nama + ", Dengan NIM " + nim + " Data Anda Sudah Kami simpan, Terima Kasih"); akan mencetak output berupa gabungan variable nama dan nim.
-	Kemudian System.out.println("Daftar Ulang Mahasiswa");
*/