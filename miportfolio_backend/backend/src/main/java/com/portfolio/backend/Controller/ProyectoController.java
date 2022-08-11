
package com.portfolio.backend.Controller;

import com.portfolio.backend.InterfaceS.IProyectoService;
import com.portfolio.backend.entity.EProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class ProyectoController {
    @Autowired IProyectoService iProyecS;

    @GetMapping("/proyectos/mostrar")
    public List<EProyecto> verProyec(){
        return iProyecS.verProyec();
    }
    
    @GetMapping("/proyectos/buscar/{id}")
    public EProyecto buscarProyec(@PathVariable Long id){
        return iProyecS.buscarProyec(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyectos/crear")
    public String crearProyec(@RequestBody EProyecto proy){
        iProyecS.crearProyec(proy);
        return "El proyecto se creo correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyectos/borrar/{id}")
    public String borrarProyec(@PathVariable Long id){
        iProyecS.borrarProyec(id);
        return "El proyecto se borro correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyectos/editar/{id}")
    public EProyecto editProyec(@PathVariable Long id,
                                @RequestParam("titulo")String nTitulo,
                                @RequestParam("enlace")String nEnlace,
                                @RequestParam("fecha")String nFecha,
                                @RequestParam("descripcion")String nDescrip,
                                @RequestParam("img_proyec")String nImg_proyec){
        EProyecto proy = iProyecS.buscarProyec(id);
        proy.setTitulo(nTitulo);
        proy.setEnlace(nEnlace);
        proy.setFecha(nFecha);
        proy.setDescripcion(nDescrip);
        proy.setImg_proyec(nImg_proyec);
        iProyecS.crearProyec(proy);
        return proy;
    }
}
