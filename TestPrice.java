/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.price;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ελισσαβετ
 */
public class TestPrice {
    
    public static void main(String[] args){
       int n=10;
       Price[] ox=new Price[n];
       Scanner scanner=new Scanner(System.in); 
       Random rnd=new Random();
       int temp;
       int pORd;
       double value;
       for (int i=0; i<n; i++){
         try{
          temp=rnd.nextInt(2);
          if(temp == 0){
             pORd=scanner.nextInt();
             value=scanner.nextDouble();
             ox[i]=new Boat(pORd, value);
          }else{
             pORd=scanner.nextInt();
             value=scanner.nextDouble();
             ox[i]=new Car(pORd, value);
          }
        }catch (LathosEisodou e){
           System.out.println("Error occured in the proccess");
           i--;
        }
       }
    }
    
    public double avgCharge(Price[] ox){
      int m=10;
      double sum=0;
      int k=0;
      for (int j=0; j<m; j++){
        if(ox[j] instanceof Car){
           Car car=(Car) ox[j];
           sum=sum + car.Charge();
           k++;
        }
      }
      if (k != 0){
      return sum / k;
    }   
      return 0;
    }
    
    public int maxBoat(Price[] ox){
       int n=0;
       int sum=0;
       for (int i=0; i<n; i++){
         if (ox[i] instanceof Boat){
            Boat boat=(Boat) ox[i];
            sum=sum + boat.people;
         }         
       }
       return sum;
    }
}
    
        