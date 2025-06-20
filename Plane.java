/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plane;

/**
 *
 * @author Ελισσαβετ
 */
public class Plane {
    public String xarAn;
    public String etairia;
    
    public Plane(String xa, String e){
        xarAn=xa;
        etairia=e;
    }

    public String getXarAn() {
        return xarAn;
    }

    public String getEtairia() {
        return etairia;
    }

    public void setXarAn(String xarAn) {
        this.xarAn = xarAn;
    }

    public void setEtairia(String etairia) {
        this.etairia = etairia;
    }

    @Override
    public String toString() {
        return "Plane{" + "xarAn=" + xarAn + ", etairia=" + etairia + '}';
    }
    
    
}
