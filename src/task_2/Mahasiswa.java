/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;
import java.util.Arrays;
/**
 *  NIM = 1103130047
 *  Nama = Muhammad Zakaria Musa
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String status;
    private char[] nilai = new char[10];
    private int i;
    
    public Mahasiswa(){
        i = 0;
        status = "Tidak Lulus";
    }
    public Mahasiswa(String nim, String nama){
        i = 0;
        status = "Tidak Lulus";
        this.nama = nama;
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getStatus(){
        return status;
    }
    public char getNilai(int i){
        return nilai[i];
    }public char[] getNilai(){
        return nilai;
    }public int getI(){
        return i;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNIM(String nim){
        this.nim=nim;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public void addNilai(char nilai){
        this.nilai[i]=nilai;
        this.i = i+1;
    }
    
    
    public String toString(){
        String n = nim + ", " +nama+ ", " +status+ ", " + "Nilai = ";
        for (int m = 0; m <= i; m++){
            if(m==i){
                n =n + nilai[m];
            }
            else{
                n =n + nilai[m] + ",";
            }
        }
        return n;
    }
    
    public char cekNilai(Mahasiswa m){
        int k = m.getI();
 
        
        for(char c='A';c<='E';c++){
            for (int h=0;h<=i;h++){
                 if((getNilai(h)==c)){
                    for(int j=0;j<=k;j++){
                        if((getNilai(h)== m.getNilai(j))){
                            return getNilai(h);
                        }
                    }
                }    
            }
        }
        return 'X';
        
    }
    
}
