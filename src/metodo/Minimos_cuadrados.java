/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

import com.sun.org.apache.bcel.internal.Repository;
import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Minimos_cuadrados {
public double X,Y;
ArrayList<Double> getX = new ArrayList<Double>();
ArrayList<Double> getY = new ArrayList<Double>();
    public Minimos_cuadrados() {
        
    }
    
    public void calcula(){
        
        getX.add(1.0);
        getX.add(2.0);
        getX.add(3.0);
        getX.add(4.0);
        
        getY.add(1.4);
        getY.add(1.1);
        getY.add(0.7);
        getY.add(0.1);
        double suma=0;
        double sumaY=0;
        
        //obtener X
        for (int i = 0; i <getX.size(); i++) {
            suma+=Double.parseDouble(getX.get(i).toString());
           
        }
        
        double n=getX.size();
        X=(1/n)*(suma);
        System.out.println("x="+X);
        
        //obtener Y
        
        for (int i = 0; i <getY.size(); i++) {
            sumaY+=Double.parseDouble(getY.get(i).toString());
            
        }
        
        double nY=getY.size();
        Y=(1/nY)*(sumaY);
        System.out.println("Y="+Y);
        
        
        
        //obtener m
        //obtener numerador
        double m=0,resNum=0,resDen=0;
         for (int i = 0; i <getX.size(); i++) {
            suma+=Double.parseDouble(getX.get(i).toString());
           resNum+=((Double.parseDouble(getX.get(i).toString())*(Y))-(Double.parseDouble(getX.get(i).toString())*(Double.parseDouble(getY.get(i).toString()))));
        }
        
        
        
        System.out.println("num="+resNum);
        //obtener denominador
        
        for (int i = 0; i <getX.size(); i++) {
            suma+=Double.parseDouble(getX.get(i).toString());
           resDen+=((Double.parseDouble(getX.get(i).toString())*(X))-(Double.parseDouble(getX.get(i).toString())*(Double.parseDouble(getX.get(i).toString()))));
        }
        System.out.println("den="+resDen);
        
        m=resNum/resDen;
         System.out.println("m="+m);
         
         double b=0;
         b=Y-m*X;
         System.out.println("b="+b);
         System.out.println("f(x)="+m+"x"+"+"+b);
    }
    
    public static void main(String[] args) {
        Minimos_cuadrados nuevo=new Minimos_cuadrados();
        nuevo.calcula();
    }
}
