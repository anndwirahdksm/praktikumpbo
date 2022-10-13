package pertwmuan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A N A N D A
 */
public class Siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    private String alamat;
    
    public void isiData(){
        nama = "Ananda";
        nilai = 90;
        kelas = "XI RPl B";
        alamat = "Mojolaban";
        
    }
    
    public void cetak(){
        System.out.println("Nama   : " + nama);
        System.out.println("Nilai  : " + nilai);
        System.out.println("Kelas  : " + kelas);
        System.out.println("alamat : " + alamat);
    }
}
