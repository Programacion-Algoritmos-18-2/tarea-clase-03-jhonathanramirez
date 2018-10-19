/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Usuario
 */
//Clase Docente que hereda de la clase Persona
public class Docente extends Persona{
     private double  sueldo;
     //Constructor de la clase Docente
     public Docente(String n, String a, int e, double s){
        //Utiliza metodos de la clase Padre 
         super(n, a, e);
        sueldo = s;
       
    }
    //Metodos get y set
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //Sobrescribir el metodo to String 
     @Override
    public String toString(){
    
        return String.format("%s - Sueldo: %f", super.toString(), getSueldo());
}
}