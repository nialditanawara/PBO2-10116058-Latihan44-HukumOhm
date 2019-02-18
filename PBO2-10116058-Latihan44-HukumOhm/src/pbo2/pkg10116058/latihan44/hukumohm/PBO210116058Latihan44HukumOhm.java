/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan44.hukumohm;

public class PBO210116058Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        Baterai ohm = new Baterai(3,12);
        System.out.println("Kuat Arus : " +ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " +ohm.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : " +ohm.hitungTegangan()+ " volt");
    }
    
}
