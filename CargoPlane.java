/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plane;

/**
 *
 * @author Ελισσαβετ
 */
public class CargoPlane extends Plane implements CargoDesign{
    public double fortio;
    
    public CargoPlane(double f,String xa, String e){
       fortio=f;
       xarAn=xa;
       etairia=e;
    }

    public double getFortio() {
        return fortio;
    }


    public void setFortio(double fortio) {
        this.fortio = fortio;
    }

    public void specialCargo(String eidosFortiou){
       System.out.println(eidosFortiou);
    }
    
    @Override
    public String toString() {
        return "CargoPlane{" + "fortio=" + fortio + '}';
    }
    
    
}
