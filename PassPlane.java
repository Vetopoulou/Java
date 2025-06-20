/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plane;

/**
 *
 * @author Ελισσαβετ
 */
public class PassPlane extends Plane{
    public int theseis;
    
    public PassPlane(int th,String xa, String e){
        theseis=th;
        xarAn=xa;
        etairia=e;
    }

    public int getTheseis() {
        return theseis;
    }

    public void setTheseis(int theseis) {
        this.theseis = theseis;
    }



    @Override
    public String toString() {
        return "PassPlane{" + "theseis=" + theseis + '}';
    }
    
    
}
