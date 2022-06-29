package com.yoprogramo.primerproyecto;
public class Persona {
//Atributos
private int id;
private String dni;
private String nombre;
private String apellido;
private String direccion;
private String celular;
private int edad;
//Constructor por defecto
        public Persona(){
                
        }
  //Constructor con parametos
 public Persona(int valorID,String valorDni,String valorNombre,String valorApellido,
        String valorDireccion,String valorCelular ,int valorEdad ){
   id =valorID;
   dni = valorDni;
   nombre=valorNombre;
   apellido= valorApellido;
   direccion = valorDireccion;
   celular = valorCelular;
   edad= valorEdad;
 }
// Atributos de la clase
    public void setID (int valorid) {
        id = valorid;
    } 
    public int getID() { 
      return id; 
    } 
    public void setDni (String valorDni) {
        dni = valorDni;
    } 
    public String getDni() { 
      return dni; 
    } 
    public void setNombre (String valorNombre) {
        nombre = valorNombre;
    } 
    public String getNombre () { 
      return nombre; 
    } 
    public void setApellido (String valorApellido) {
        apellido = valorApellido;
    } 
    public String getApellido() { 
      return apellido; 
    } 
    public void setDireccion (String valorDireccion) {
        direccion = valorDireccion;
    } 
    public String getDireccion() { 
      return direccion; 
    } 
    public void setCelular (String valorCelular) {
        celular = valorCelular;
    } 
    public String getCelular() { 
      return celular; 
    } 
    public void setEdad (int valorEdad) {
        edad = valorEdad;
    } 
    public int getEdad() { 
      return edad; 
    } 
    
}