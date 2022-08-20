
package com.portfolio.backend.Controller;

import com.portfolio.backend.InterfaceS.IExperienciaService;
import com.portfolio.backend.entity.EExperiencia;
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
//@CrossOrigin(origins = "https://front-portfolioap.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired IExperienciaService iexperineciaS;
     
    @GetMapping("/experiencia/mostrar")
    public List<EExperiencia> verExpe(){
        return iexperineciaS.verExpe();
    }
    @GetMapping("/experiencia/buscar/{id}")
    public EExperiencia buscarExpe(@PathVariable Long id){
        return iexperineciaS.buscarExpe(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia/crear")
    public String crearExpe(@RequestBody EExperiencia expe){
        iexperineciaS.crearExpe(expe);  
        return "Experiencia, se creo correctamente.";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("experiencia/borrar/{id}")
    public String borrarExpe(@PathVariable Long id){
        iexperineciaS.borrarExpe(id);
        return "Experiencia, Se elimino correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencia/editar/{id}")
    public EExperiencia editExpe(@PathVariable Long id,
                                     @RequestParam("empresa") String nEmpresa,
                                     @RequestParam("cargo") String nCargo,
                                     @RequestParam("periodo") String nPeriodo,
                                     @RequestParam("enlace") String nEnlace,
                                     @RequestParam("descripcion") String nDescripcion,
                                     @RequestParam("logo_empresa") String nLogo_perfil){
        EExperiencia expe = iexperineciaS.buscarExpe(id);
        expe.setEmpresa(nEmpresa);
        expe.setCargo(nCargo);
        expe.setPeriodo(nPeriodo);
        expe.setEnlace(nEnlace);
        expe.setDescripcion(nDescripcion);
        expe.setLogo_empresa(nLogo_perfil);
        iexperineciaS.crearExpe(expe);
        return expe;
    }
}
