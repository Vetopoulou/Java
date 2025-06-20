/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.price;

/**
 *
 * @author Ελισσαβετ
 */
public class Car implements Price{
    public int days;
    public double dayValue;
    
    public Car(int d, double dv) throws LathosEisodou{
       if(days<1 || days>20) throw new LathosEisodou("not acceptable amount of days"); 
       days=d;
       dayValue=dv;
    }

    public int getDays() {
        return days;
    }

    public double getDayValue() {
        return dayValue;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setDayValue(double dayValue) {
        this.dayValue = dayValue;
    }
    
    public double Charge(){
       return days * dayValue;
    }

    @Override
    public String toString() {
        return "Car{" + "days=" + days + ", dayValue=" + dayValue + '}';
    }
    
    
}
