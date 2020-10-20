/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Stks
 */
public class Kambing {
    public void tambahKambing(){
        //deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing+5;
        System.out.println("Jumlah Kambing Setelah ditambah: "+ jumlahKambing);
    }
  public static void main(String[] args){
     Kambing kambingJantan = new Kambing();
     kambingJantan.tambahKambing();
  }  
}
