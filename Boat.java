/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.price;

/**
 *
 * @author Ελισσαβετ
 */
public class Boat implements Price{
    public int people;
    public double pValue;
    
    public Boat(int p, double pv) throws LathosEisodou{
       if (people<1 || people >7) throw new LathosEisodou("not acceptable amount of people");
       people=p;
       pValue=pv;
    }

    public int getPeople() {
        return people;
    }

    public double getpValue() {
        return pValue;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void setpValue(double pValue) {
        this.pValue = pValue;
    }
    
    public double Charge(){
      return people * pValue;
    } 

    public String toString() {
        return "Boat{" + "people=" + people + ", pValue=" + pValue + '}';
    }
    
    
}
