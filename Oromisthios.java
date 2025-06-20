/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.misthos;

/**
 *
 * @author Ελισσαβετ
 */
public class Oromisthios implements Misthos{
    public double oromisthio;
    public int ores;
    
    public Oromisthios(double om,int o) throws LathosEisodou {
        if (ores>1 || ores>200) throw new LathosEisodou("Unacceptable amount of hours");
        oromisthio=om;
        ores=o;
    }    

    public double getOromisthio() {
        return oromisthio;
    }

    public int getOres() {
        return ores;
    }

    public void setOromisthio(double oromisthio) {
        this.oromisthio = oromisthio;
    }

    public void setOres(int ores) {
        this.ores = ores;
    }
    
    public double salary(){
       return ores * oromisthio;
    }

    @Override
    public String toString() {
        return "Oromisthios{" + "oromisthio=" + oromisthio + ", ores=" + ores + '}';
    }
    
    
}
