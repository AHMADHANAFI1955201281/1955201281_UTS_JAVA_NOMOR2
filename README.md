# 1955201281_UTS_JAVA_NOMOR2
Repository ini berisi penyelesaian UTS Java nomor 2 yaitu berupa projeck praktikum mengenai I/O, Percabangan, dan Perulangan yang didalamnya terdapat komentar deskripsi/penjelasan singkat mengenai program yang dibuat


DESKRIPSI PROGRAM

1.	Input / Output  

1)	Buffer reader 

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

2)	J Option Pane

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

3)	Scanner

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

2.	PERCABANGAN

1)	Percabangan If

Deskripsi Program :

Program keaktifan melakukan Penelitian dengan nama class PercabanganIf. 
Class adalah suatu ‘blue print’ untuk menciptakann instatnce dari suatu object. Program dibuat pada fungsi utama main(), dimana kita inisilisasi variabel penelitian menggunakan tipe data integer dengan nilai 0.
Kemudian terdapat percabangan IF dengan kondisi penelitian > 10 ? jika kondisi tersebut benar (true) maka pernyatataan untuk mencetak output “Selamat, Anda Termasuk Mahasiswa AKTIF melakukan Program Penelitian” akan di eksekusi. Sementara jika kondisi salah (false) program tidak mengerjakan perintah apapun.

2)	Percabangan If Else

Deskripsi Program :

Program mahasiswa bergelar cumlaude terdapat variabel ipk dengan nilai >= 3.75. Kemudian ada percabangan IF dengan kondisi apakah nilai ipk adalah >=3.75 ? Jika benar maka tampilkan kalimat "Selamat " + nama + " Anda Termasuk Mahasiswa yang Bergelar CUMLAUDE" namun jika salah tampilkan "Maaf " + nama + " Anda Belum Meraih Gelar CUMLAUDE ". Dari contoh ini dapat kita lihat dengan sederhana bahwa nilai ipk adalah lebih atau sama dengan 3.75 apabila kurang dari  3.75 sehingga kondisi bernilai salah (false) maka pernyataan yang di eksekusi adalah pada bagian ELSE yaitu menampilkan kalimat "Maaf " + nama + " Anda Belum Meraih Gelar CUMLAUDE ".

3)	Percabangan Switch Case

Deskripsi Program :

Program diatas tentang pemilihan Fakultas dimana kita akan menggunakan class scanner agar memungkinkan user dapat menginput nilai saat program dijalankan. Nilai yang dimasukan oleh user akan disimpan pada variabel pilihan, kemudian nilai pilihan akan dibandingkan dengan setiap case yang ada pada struktur switch, jika ada salah satu case yang sama (bernilai true) maka pernyataan pada case tersebutlah yang dieksekusi.
Sebagai contoh jika pilihan yang saya masukan 3 adalah  maka pernyataan pada case ke 3  yang akan dieksekusi dengan menampilkan kata “Fakultas Kedokteran”

3.	PERULANGAN

1)	Do While

Deskripsi Program :

Program Jam Perkuliahan menggunakan perulangan Do While dengan membuat variabel bilangan dengan nilai 1. Kemudian selanjutnya terdapat perulangan do while, dimana program akan mencetak terlebih dahulu nilai pada variabel bilangan pada System.out.println("JAM PERKULIAHAN ke-" + i); nilai pada variabel tersebut adalah 1 dan nilai tersebut dicetak, lalu baru setelah itu di cek kondisi apakah nilai pada variabel bilangan dalam hal ini int i = 1;, while ( i<=10);, maka perulangan dimulai dari perulangan ke-1 sampai perulangan ke 10, dan setelah perulangan ke-10 jawabannya salah (false) sehingga perulangan dihentikan dan tidak tercetak.

2)	For

Deskripsi Program :

Pada program Perulangan Bilangan menggunakan perulangan for untuk parameter pertama kita lakukan inisialisasi nilai awal variabel i=0. kemudian kita membuat kondisi i <= 10;, pada bagian modifier kita melakukan penambahan (increment) nilai i++. Artinya bahwa ketika kondisi bernilai benar nilai i akan ditambahkan 1 dalam program ini kita membuat kondisi i <= 10, System.out.print( i + " ") maka akan tercetak perulangan bilangan 0 sampai 10 saja dengan jarak satu spasi. Bilangan yang lebih dari 10  tidak tercetak karena termasuk kondisi yang bernilai false.

3)	While

Deskripsi Program :

Pada program Perulangan While Menentukan Mahasiswa UNU Blitar menggunakan fungsi scanner agar user dapat menginput nilai saat program sedang berjalan. Terdapat variabel perulangan dengan tipe data integer dan nilai awal adalah 0. Kemudian ada perulangan while dengan output System.out.println("Apakah anda Mahasiswa UNU Blitar?"); yang menampilkan kalimat "Apakah anda Mahasiswa UNU Blitar?" menampilkan output System.out.print("Jawab [ya/bukan]> "); yang memerintahkan user untuk mengimput kata “ya / bukan”. Dengan kondisi if( jawab.equalsIgnoreCase("ya") ){, syarat ini berarti jika nilai yang terdapat di dalam variabel perulangan menginputkanya bukan kata “ya” maka perulangan akan terus dilakukan sampai variabel bilangan harus kata “ya”. Perulangan dilakukan dengan mencetak kalimat “Apakah anda Mahasiswa UNU Blitar? Jawab [ya/bukan]> “dimana user akan memasukan kata , selama bilangan yang dimasukan oleh pengguna kata “ya” program ini akan terus diulang-ulang. Program akan berhenti ketika pengguna mamasukan kata “ya”.
