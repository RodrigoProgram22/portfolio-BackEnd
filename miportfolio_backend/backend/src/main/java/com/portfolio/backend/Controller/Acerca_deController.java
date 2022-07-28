package com.portfolio.backend.Controller;

import com.portfolio.backend.InterfaceS.IAcerca_deService;
import com.portfolio.backend.entity.EAcerca_de;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class Acerca_deController {
    @Autowired IAcerca_deService IAcerca_de;

    @GetMapping("/Acerca_de/buscar/{id}")
    public EAcerca_de buscarAcercaDe(@PathVariable Long id){
        return IAcerca_de.buscarAcercaDe(id);
    }

    @PostMapping("/Acerca_de/crear")
    public String crearAcercaDe(@RequestBody EAcerca_de acerca_de){
        IAcerca_de.crearAcercaDe(acerca_de);  
        return "Acerca_de, se creo correctamente.";
    }
    
    @DeleteMapping("Acerca_de/borrar/{id}")
    public String borrarAcercaDe(@PathVariable Long id){
        IAcerca_de.borrarAcercaDe(id);
        return "Acerca_de, Se elimino correctamente";
    }
    
    @PutMapping("/Acerca_de/editar/{id}")
    public EAcerca_de editarAcercaDe(@PathVariable Long id,
                                     @RequestParam("nombre_apellido") String nNombre,
                                     @RequestParam("titulo") String nTitulo,
                                     @RequestParam("email") String nEmail,
                                     @RequestParam("descripcion") String nDescripcion,
                                     @RequestParam("img_perfil") String nImg){
        EAcerca_de acerca_de = IAcerca_de.buscarAcercaDe(id);
        acerca_de.setNombre_apellido(nNombre);
        acerca_de.setTitulo(nTitulo);
        acerca_de.setEmail(nEmail);
        acerca_de.setDescripcion(nDescripcion);
        acerca_de.setImg_perfil(nImg);
        
        IAcerca_de.crearAcercaDe(acerca_de);
        return acerca_de;
    }
   
}
