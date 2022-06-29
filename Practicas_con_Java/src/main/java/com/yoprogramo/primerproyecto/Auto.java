
package com.yoprogramo.primerproyecto;

public class Auto {
   //Atributos
private int num_patente;
private String marca;
private String modelo;
private String color;
private String chasis;
//Constructor por defecto
        public Auto(){
                
        }
public Auto(int valorNumPatente,String valorMarca,String valorModelo,String valorColor,
        String valorChasis){
   num_patente =valorNumPatente;
   marca = valorMarca;
   modelo =valorModelo;
   color= valorColor;
   chasis = valorChasis;
 }
// Atributos de la clase
    public void setNum_Patente (int valorNumPatente) {
        num_patente = valorNumPatente;
    } 
    public int getNum_Patente() { 
      return num_patente; 
    }  
    public void setMarca (String valorMarca) {
        marca = valorMarca;
    } 
    public String getMarca() { 
      return marca; 
    }
    public void setModelo (String valorModelo) {
        modelo = valorModelo;
    } 
    public String getModelo() { 
      return modelo; 
    }
    public void setColor (String valorColor) {
        color = valorColor;
    } 
    public String getColor() { 
      return color; 
    }
    public void setChasis (String valorChasis) {
        chasis = valorChasis;
    } 
    public String getChasis() { 
      return chasis; 
    }
}
