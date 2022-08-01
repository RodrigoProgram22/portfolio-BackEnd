package com.portfolio.backend.Controller;

import com.portfolio.backend.InterfaceS.IEducacionService;
import com.portfolio.backend.entity.EEducacion;
import java.util.List;
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
public class EducacionController {
    @Autowired IEducacionService iEduS;
    
    @GetMapping("/educacion/mostrar")
    public List<EEducacion> verExpe(){
        return iEduS.verEdu();
    }
    @GetMapping("/educacion/buscar/{id}")
    public EEducacion buscarEdu(@PathVariable Long id){
        return iEduS.buscarEdu(id);
    }
    @PostMapping("/educacion/crear")
    public String crearEdu(@RequestBody EEducacion edu){
        iEduS.crearEdu(edu);
        return "Educacion, se creo correctamente.";
    }
    @DeleteMapping("educacion/borrar/{id}")
    public String borrarEdu(@PathVariable Long id){
        iEduS.borrarEdu(id);
        return "Educacion, Se elimino correctamente";
    }
    @PutMapping("/educacion/editar/{id}")
    public EEducacion editEdu(@PathVariable Long id,
                              @RequestParam("nombre") String nNombre,
                              @RequestParam("titulo") String nTitulo,
                              @RequestParam("fecha") String nFecha,
                              @RequestParam("enlace") String nEnlace,
                              @RequestParam("logo_inst") String nLogo_inst){
    EEducacion edu = iEduS.buscarEdu(id);
    edu.setNombre_inst(nNombre);
    edu.setTitulo(nTitulo);
    edu.setFecha(nFecha);
    edu.setEnlace(nEnlace);
    edu.setLogo_inst(nLogo_inst);
    iEduS.crearEdu(edu);
    return edu;
    }
}
