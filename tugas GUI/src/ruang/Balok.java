/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;

/**
 *
 * @author Acer
 */
public class Balok extends Persegi implements Ruang {
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    

    @Override
    public double luaspermukaan() {
        return 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi)) ;
    }

    @Override
    public double volume() {
        return this.luas()*this.tinggi;
    }
    
}
