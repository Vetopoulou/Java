/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plane;

/**
 *
 * @author Ελισσαβετ
 */
public class Airport {
    public String password;
    public int count=0;
    public Plane[] aerop=new Plane[count];
    
    public Airport(String p){
      password=p;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Airport{" + "password=" + password + ", count=" + count + ", aerop=" + aerop + '}';
    }
    
    
    
    
}
