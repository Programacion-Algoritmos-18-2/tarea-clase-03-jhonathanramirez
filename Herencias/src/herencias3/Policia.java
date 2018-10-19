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
//Clase Policia que hereda de la clase Persona 
public class Policia extends Persona{
    private String  rango;
    //Constructor de la clase Policia
    public Policia(String n, String a, int e, String r){
        //Utilizar metodos de la clase padre
        super(n, a, e);
        rango=r;
       
    }
    //Metodos de la clase get y set
    public String getRango() {
        return rango;
    }

    public void setRango(String r) {
       rango = r;
    }
    //Sobrescribir el metodo to String 
    @Override
    public String toString(){
    
        return String.format("%s - El Rango: %s", super.toString(), getRango());
    }
    
}
