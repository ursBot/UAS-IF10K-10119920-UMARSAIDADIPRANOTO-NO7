/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if10k.pkg10119920.umarsaidadipranoto.no7;

/**
 *
 * @author
 * NAMA     : Umar Said Adi Pranoto
 * NIM      : 10119920
 * KELAS    : IF10K
 * TANGGAL  : 19 Februari 2021
 * NO SOAL  : 7
 * 
 */
      

public class Bilangan {

    private int nilai1;
      private int nilai2;
    
    public Bilangan() {
        this.nilai1 = 3;
        this.nilai2 = 4;
    }
    
    public int getNilai1() {
        return nilai1;
    }
    
    public int getNilai2() {
        return nilai2;
    }
    
    public static void main(String[] args) {
        
        JumlahBilangan jumlah = new JumlahBilangan();
        jumlah.jumlahkan();
        
        SelisihBilangan selisih = new SelisihBilangan();
        selisih.kurangkan();
    
    }
}
