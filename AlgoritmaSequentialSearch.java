/*
 * tugas sesi 10 ALGODATA a
 */

/**
 * @Salman Alfariji
 */
package com.community.java;

public class AlgoritmaSequentialSearch {
   private String [] allData = new String[]{"2", "4", "5", "8", "9", "13"};
    
    private void tampilkanData(){
        for (String data : allData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    
    private void searching(String karakter){
        int x = 0;
        boolean ketemu = false;
        for (int i = x; i < allData.length; i++) {
            if(karakter.equals(allData[i])){
                ketemu = true;
                x = i;
            }
        }
        if(ketemu){
            System.out.println("Data berada pada urutan ke - "+(x+1));
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
    public static void main(String[] args) {
        AlgoritmaSequentialSearch  obj = new AlgoritmaSequentialSearch ();

//        Untuk menampilkan data pada Array
        obj.tampilkanData();
        
//        Melakukan pencarian data
        obj.searching("C");
    }
} 

