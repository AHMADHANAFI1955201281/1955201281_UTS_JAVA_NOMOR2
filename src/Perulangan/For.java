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
public class For {
     public static void main(String[] args) {
        for(int i=0; i <= 10; i++) {
            System.out.print( i + " ");
        }
    }
    
}

/*2)	For
Deskripsi Program :
Pada program Perulangan Bilangan menggunakan perulangan for untuk parameter pertama kita lakukan inisialisasi nilai awal variabel i=0. kemudian kita membuat kondisi i <= 10;, pada bagian modifier kita melakukan penambahan (increment) nilai i++. Artinya bahwa ketika kondisi bernilai benar nilai i akan ditambahkan 1 dalam program ini kita membuat kondisi i <= 10, System.out.print( i + " ") maka akan tercetak perulangan bilangan 0 sampai 10 saja dengan jarak satu spasi. Bilangan yang lebih dari 10  tidak tercetak karena termasuk kondisi yang bernilai false.
*/