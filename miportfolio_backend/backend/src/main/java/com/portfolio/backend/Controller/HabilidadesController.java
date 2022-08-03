
package com.portfolio.backend.Controller;

import com.portfolio.backend.InterfaceS.IHabilidadesService;
import com.portfolio.backend.entity.EHabilidades;
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
public class HabilidadesController {
    @Autowired IHabilidadesService iHabS;
    
    @GetMapping("/habilidades/mostrar")
    public List<EHabilidades> verHab(){
        return iHabS.verHab();
    }
    @GetMapping("/habilidades/buscar/{id}")
    public EHabilidades buscarHab(@PathVariable Long id){
        return iHabS.buscarHab(id);
    }
    @PostMapping("/habilidades/crear")
    public String crearHab(@RequestBody EHabilidades edu){
        iHabS.crearHab(edu);
        return "Habilidad creada correctamente";
    }
    @DeleteMapping("/habilidades/borrar/{id}")
    public String borrarHab(@PathVariable Long id){
        iHabS.borrarHab(id);
        return "Habilidad borrada correctamente";
    }
    @PutMapping("/habilidades/editar/{id}")
    public EHabilidades editHab(@PathVariable Long id,
                                @RequestParam("nombre") String nNombre,
                                @RequestParam("nivel") int nNivel,
                                @RequestParam("enlace") String nEnlace,
                                @RequestParam("logo_hab") String nlogoImg                                ){
        EHabilidades hab = iHabS.buscarHab(id);
        hab.setNombre_hab(nNombre);
        hab.setNivel_hab(nNivel);
        hab.setEnlace(nEnlace);
        hab.setLogo_hab(nlogoImg);
        iHabS.crearHab(hab);
        return hab;
    }
}
