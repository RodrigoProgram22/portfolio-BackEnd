
package Class;

public class Cliente {
//Atributos
private String dni;
private String nombre;
private String apellido;
private String telefono;
//Constructor por defecto
        public Cliente(){
                
        }
  //Constructor con parametos
 public Cliente(String valorDni,String valorNombre,String valorApellido,
    String valorTelefono){
   dni = valorDni;
   nombre=valorNombre; 
   apellido= valorApellido;
   telefono= valorTelefono;
 }
// Atributos de la clase
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
    public void setTelefono (String valorTelefono) {
        telefono = valorTelefono;
    } 
    public String getTelefono() { 
      return telefono; 
    }
}
