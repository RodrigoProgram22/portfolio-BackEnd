
package Class;

public class Auto {
   //Atributos
private String placa;
private String marca;
private String modelo;
private String color;
private String tipo_motor;
//Constructor por defecto
        public Auto(){
                
        }
public Auto(String valorPlaca,String valorMarca,String valorModelo,String valorColor,
        String valorTipo_motor){
   placa =valorPlaca;
   marca = valorMarca;
   modelo =valorModelo;
   color= valorColor;
   tipo_motor = valorTipo_motor;
 }
// Atributos de la clase
    public void setPlaca (String valorPlaca) {
        placa = valorPlaca;
    } 
    public String getNum_Patente() { 
      return placa; 
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
    public void setTipo_motor (String valorTipo_motor) {
        tipo_motor = valorTipo_motor;
    } 
    public String getTipo_motor() { 
      return tipo_motor; 
    }
}
