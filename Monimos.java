/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.misthos;

/**
 *
 * @author Ελισσαβετ
 */
public class Monimos implements Misthos{
    public int meres;
    public double hmeromisthio;
    
    public Monimos(int m, double hm ) throws LathosEisodou{
       if (meres>28 || meres<1) throw new LathosEisodou("Unacceptable ammount of days");
       meres=m;
       hmeromisthio=hm;
    }

    public int getMeres() {
        return meres;
    }

    public double getHmeromisthio() {
        return hmeromisthio;
    }

    public void setMeres(int meres) {
        this.meres = meres;
    }

    public void setHmeromisthio(double hmeromisthio) {
        this.hmeromisthio = hmeromisthio;
    }
    
    public double salary(){
      return meres * hmeromisthio;
    }

    @Override
    public String toString() {
        return "Monimos{" + "meres=" + meres + ", hmeromisthio=" + hmeromisthio + '}';
    }
    
    
}
