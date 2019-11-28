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
public static double X,Y;
public static ArrayList<Double> getX = new ArrayList<Double>();
public static ArrayList<Double> getY = new ArrayList<Double>();
public static double m=0,resNum=0,resDen=0;
    public Minimos_cuadrados() {
        
    }
    
    public static String calcula(){
        
        String cadena;
        double suma=0;
        double sumaY=0;
        boolean flag1=true;
        double xx=Double.parseDouble(getX.get(0).toString());;
         boolean flag2=true;
        double yy=Double.parseDouble(getY.get(0).toString());;
        //obtener X
        for (int i = 0; i <getX.size(); i++) {
            suma+=Double.parseDouble(getX.get(i).toString());
           if(Double.parseDouble(getX.get(i).toString())==xx){
               flag1=true;
           }else flag1=false; //si la bandera es falsa, garantizamos que la recta no sea vertical
        }
        
        double n=getX.size();
        X=(1/n)*(suma);
        System.out.println("x="+X);
        
        //obtener Y
        
        for (int i = 0; i <getY.size(); i++) {
            sumaY+=Double.parseDouble(getY.get(i).toString());
            if(Double.parseDouble(getY.get(i).toString())==yy){
               flag2=true;
           }else flag2=false;
        }
        
        double nY=getY.size();
        Y=(1/nY)*(sumaY);
        System.out.println("Y="+Y);
        
        
        
        //obtener m
        //obtener numerador
        
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
         cadena="f(x)="+m+"x"+"+("+b+")";
         if(flag1)return "Es una recta vertical en x="+xx;
         if(flag2)return "Es una recta horizontal con y="+yy;
         return cadena;
    }
    
    public static void main(String[] args) {
        Minimos_cuadrados nuevo=new Minimos_cuadrados();
        nuevo.calcula();
    }
}
