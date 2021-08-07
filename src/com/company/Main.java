package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner ( System.in );
    public static void main(String[] args) {
        HashMap<String, Integer> objectSatu = new HashMap<String,Integer>();
        HashMap<String, Integer> objectDua = new HashMap<String,Integer>();
        HashMap<String, Integer> gabungan = new HashMap<String,Integer>();

        //Mengisi nilai ke Object Satu
        System.out.println("Objek Satu");
        System.out.print("Masukkan angka pertama : ");
        objectSatu.put("Angka Pertama", scan.nextInt());

        System.out.print("Masukkan angka kedua : ");
        objectSatu.put("Angka Kedua", scan.nextInt());

        System.out.print("Masukkan angka ketiga : ");
        objectSatu.put("Angka Ketiga", scan.nextInt());

        System.out.println();

        //Mengisi nilai ke map Object Dua
        System.out.println("Objek Dua");
        System.out.print("Masukkan angka pertama : ");
        objectDua.put("Angka Pertama", scan.nextInt());

        System.out.print("Masukkan angka kedua : ");
        objectDua.put("Angka Kedua", scan.nextInt());

        System.out.print("Masukkan angka ketiga : ");
        objectDua.put("Angka Ketiga", scan.nextInt());


        //Menjumlahkan nilai dari map Awan dan Bulan dengan memasangkan masing masing key nya
        //Kemudian hasil penjumlahan dimasukkan ke map yg baru
        for(Map.Entry b: objectSatu.entrySet()){
            for(Map.Entry c: objectDua.entrySet()){

                if(b.getKey() == c.getKey()){
                    Integer newValue = objectSatu.get(b.getKey()) + objectDua.get(c.getKey());
                    gabungan.put((String) b.getKey(), newValue);
                }

            }

        }

        System.out.println();
        System.out.println("Hasil gabungan object satu dan dua: " + gabungan);
    }
}
