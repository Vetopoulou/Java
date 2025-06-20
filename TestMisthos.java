/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.misthos;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ελισσαβετ
 */
public class TestMisthos {
     
    public static void main(String[] args) {
       int n=10;
       Random rnd=new Random();
       Scanner scanner=new Scanner(System.in);
       Misthos[] lefta=new Misthos[n];
       int tmp;
       int dORo=0;
       double plhr;
       for (int i=0; i<n; i++){
        try{
          tmp=rnd.nextInt(2);
          if (tmp==0){
            dORo=scanner.nextInt();
            plhr=scanner.nextDouble();
            lefta[i]=new Oromisthios(plhr,dORo);
          }else{
             plhr=scanner.nextDouble();
             dORo=scanner.nextInt();
             lefta[i]=new Monimos(dORo,plhr);
          }
        }catch(LathosEisodou e){
           System.out.println("An error occured");
        }
              
       }
    }
    
    public double avgMSalry(Misthos[] lefta){
      int count=0;
      double sum=0;
      for (int j=0; j<lefta.length; j++)
        if (lefta[j] instanceof Monimos){
          Monimos mm=(Monimos) lefta[j];
          sum=sum + mm.salary();
          count=+1;
        }
      if (count != 0){
        return sum/count;
      }else{
        return 0;
      }
    }
    
    public double maxOromisthio(Misthos[] lefta){
      double max=0;
      for (int j=0; j<lefta.length; j++){
        if(lefta[j] instanceof Oromisthios){
          Oromisthios om=(Oromisthios) lefta[j];
          if (om.oromisthio > max ){
             max=om.oromisthio;
          }
        } 
    }
    return max;
  }
}
