
package com.yoprogramo.primerproyecto;

public class Mascota {
    //Atributos
    private int id;
    String nombre;
    private String especie;
    private String sexo;
    private String color;
    private String pelaje;
    private String raza;
    //Constructor por defecto
        public Mascota(){
                
        }
  //Constructor con parametos
 public Mascota(int valorID,String valorNombre,String valorEspecie,String valorSexo
                ,String valorColor,String valorPelaje,String valorRaza){
   id =valorID;
   nombre=valorNombre;
   especie=valorEspecie;
   sexo=valorSexo;
   color=valorColor;
   pelaje=valorPelaje;
   raza=valorRaza;
 }
// Atributos de la clase
   public void setID (int valorid) {
        id = valorid;
    } 
    public int getID() { 
      return id; 
    } 
     public void setNombre (String valorNombre) {
        nombre = valorNombre;
    } 
    public String getNombre () { 
      return nombre; 
    } 
    public void setEspecie (String valorEspecie) {
        especie = valorEspecie;
    } 
    public String getEspecie() { 
      return especie; 
    } 
    public void setSexo (String valorSexo) {
        sexo = valorSexo;
    } 
    public String getSexo() { 
      return sexo; 
    } 
    public void setColor (String valorColor) {
        color = valorColor;
    } 
    public String getColor() { 
      return color; 
    } 
    public void setPelaje (String valorPelaje) {
        pelaje = valorPelaje;
    } 
    public String getPelaje() { 
      return pelaje; 
    }
    public void setRaza (String valorRaza) {
        raza = valorRaza;
    } 
    public String getRaza() { 
      return raza; 
    }    
}

