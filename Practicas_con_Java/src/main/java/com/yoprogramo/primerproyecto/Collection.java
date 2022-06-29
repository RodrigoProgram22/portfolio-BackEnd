package com.yoprogramo.primerproyecto;

import java.util.ArrayList;
import java.util.*;


public class Collection {
    public static void main(String[] args) {
    // Crear la lista
    /*
    List<Persona> listaPersonas = new ArrayList<Persona>();
    listaPersonas.add(new Persona(1,"gabriel",33));
    listaPersonas.add(new Persona(1,"Lucy",12));
    listaPersonas.add(new Persona(1,"Guillermo",54));
    listaPersonas.add(new Persona(1,"Luisina",29));
    listaPersonas.add(new Persona(1,"Rodrigo",21));
    System.out.println("En la lista hay: "+ listaPersonas.size());

    System.out.println("Recorriendo la lista y mostrar el nombre y los años *************");
    //Opcion 1 - Recorrer la Lista y mostrar el nombre
    for(Persona objPersona : listaPersonas){
      
      System.out.println("Nombre: " + objPersona.getNombre()+ " de " + objPersona.getEdad()+ " Años");
    }
    

    //Opcion 2 - Recorrer la Lista y ver los id de objetos
    System.out.println("Recorriendo la lista y mostrar objetos ********************");
    for(int i=0; i<listaPersonas.size();i++ ){
      System.out.println("Persona: " + listaPersonas.get(i));
    }
     System.out.println("Fin**************************************************************");
    }
    */
     //Ejercicio 1 - Crear la lista mascota (ArrayList)
    /*
    List<Mascota> listaMascotas = new ArrayList<Mascota>();
    listaMascotas.add(new Mascota(1,"Bobi","Perro","M","Canela","Suave","Caniche"));
    listaMascotas.add(new Mascota(2,"Yacky","Perro","F","Canela","Suave","Caniche"));
    listaMascotas.add(new Mascota(3,"Juan","Caballo","M","Marron","Suave","Normal"));
    listaMascotas.add(new Mascota(4,"Moski","Mosca","F","Negro","Feo","Normal"));
    listaMascotas.add(new Mascota(5,"Mini","Gato","f","Gris","Suave","Siame"));
    System.out.println("En la lista hay: "+ listaMascotas.size());
    for(Mascota objMascota : listaMascotas){
      System.out.println("Nombre: " + objMascota.getNombre()+ ", de especie: " + 
              objMascota.getEspecie()+ ", y de pelaje : "+ objMascota.getPelaje());
    }
    System.out.println("\n");
    // listaMascotas.get(0).nombre = "Rodrigo";
    // listaMascotas.get(3).nombre = "Mosca Fea";
    listaMascotas.add(new Mascota(6,"Beetoben","Perro","M","Gris","Suave","Labrador"));
    listaMascotas.add(new Mascota(7,"Roki","Perro","F","Marron","Suave","Dogo"));
    for (int i = 0; i < listaMascotas.size(); i++) {
        if (listaMascotas.get(i).getEspecie().equals("Perro")==true){
            System.out.println(listaMascotas.get(i).getPelaje()+ "Nombre: " +
                listaMascotas.get(i).getNombre()+ ", de especie: " + 
                listaMascotas.get(i).getEspecie()+ ", y de pelaje : "+"\n");
        }
    }
    */
     //Ejercicio 2 - Crear la lista de personas (LinkedList)
     /*
     List <Persona> listaPersonas = new LinkedList<>();
     listaPersonas.add(new Persona(1,"4329999","Rodrigo","Romano","ManuelEz","3865221311",21));
     listaPersonas.add(new Persona(2,"5672211","Sebastian","Romano","ManuelEz","3865237743",22));
     listaPersonas.add(new Persona(3,"5343111","Cecilia","Ramirez","Junin","3865921231",16));
     listaPersonas.add(new Persona(4,"4232323","Maria","Juarez","Haimes","3865411231",14));
     listaPersonas.add(new Persona(5,"3233321","Robert","Perez","SanMartin","3865211232",25));
     listaPersonas.add(new Persona(6,"6323435","Lujan","Perez","SanJuan","4424243231",18));
     listaPersonas.add(new Persona(7,"2111322","Jose","Lopez","Lopez","2121323323",13));
     listaPersonas.add(new Persona(8,"1461232","Marcos","Aguirrez","Av.SanMarcos","4553444322",11));
     List <Persona> listaPersonasMenores = new LinkedList<>(); 
     List <Persona> listaPersonasMayores = new LinkedList<>();
        for (int i = 0; i < listaPersonas.size(); i++) {
            if(listaPersonas.get(i).getEdad() >= 18){
                listaPersonasMayores.add(listaPersonas.get(i));
            } else {
                listaPersonasMenores.add(listaPersonas.get(i)); 
            }
        }
        System.out.println("Los mayores son; \n");
        for(Persona objPersona : listaPersonasMayores){
            System.out.println("Nombre : " + objPersona.getNombre() + ", Apellido: "
            + objPersona.getApellido()+", Edad : "+ objPersona.getEdad());
        }
        System.out.println("***************************************");
         System.out.println("Los menores son; \n");
        for(Persona objPersona : listaPersonasMenores){   
            System.out.println("Nombre : " + objPersona.getNombre() + ", Apellido: "
            + objPersona.getApellido()+", Edad : "+ objPersona.getEdad());
        }
        */
      //Ejercicio 3 - Crear la lista de personas (stack)
      Stack<Auto> listaAutos = new Stack<>();
      listaAutos.push(new Auto(999,"Honda","T3","Verde","No"));  
      listaAutos.push(new Auto(777,"Ford","F1","Rojo","Si"));
      listaAutos.push(new Auto(123,"Fiat","1","Rojo","No"));
      listaAutos.push(new Auto(312,"Nissan","GT","Rojo","Si"));      
      listaAutos.push(new Auto(888,"Ford","Mustang GTX","Rosa","Si"));        
      System.out.println("Los autos de color rojo son; \n");
        for(Auto objAuto : listaAutos){
            if(objAuto.getColor().equals("Rojo")==true){
                System.out.println("Marca : "+ objAuto.getMarca()+", Modelo: "
                +objAuto.getModelo()+ ", Color: "+objAuto.getColor());
            }
        }
        System.out.println("\n Mostrando auto en la cima de la pila: ");
        System.out.println("Marca : "+ listaAutos.peek().getMarca()+", Modelo: "
                +listaAutos.peek().getModelo()+ ", Color: "+listaAutos.peek().getColor());
        listaAutos.pop();
        System.out.println("\n Mostrando auto en la cima de la pila: ");
        System.out.println("Marca : "+ listaAutos.peek().getMarca()+", Modelo: "
                +listaAutos.peek().getModelo()+ ", Color: "+listaAutos.peek().getColor());
    } 
}
