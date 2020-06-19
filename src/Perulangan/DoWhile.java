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

    public class DoWhile {
    public static void main(String[] args) {
        
        //membuat variabel
        int i = 1;
        
        do {
            System.out.println("JAM PERKULIAHAN ke-" + i);
            i++;
        } while ( i<=10);
        
    }
}

/*1)	Do While
Deskripsi Program :
Program Jam Perkuliahan menggunakan perulangan Do While dengan membuat variabel bilangan dengan nilai 1. Kemudian selanjutnya terdapat perulangan do while, dimana program akan mencetak terlebih dahulu nilai pada variabel bilangan pada System.out.println("JAM PERKULIAHAN ke-" + i); nilai pada variabel tersebut adalah 1 dan nilai tersebut dicetak, lalu baru setelah itu di cek kondisi apakah nilai pada variabel bilangan dalam hal ini int i = 1;, while ( i<=10);, maka perulangan dimulai dari perulangan ke-1 sampai perulangan ke 10, dan setelah perulangan ke-10 jawabannya salah (false) sehingga perulangan dihentikan dan tidak tercetak.
*/