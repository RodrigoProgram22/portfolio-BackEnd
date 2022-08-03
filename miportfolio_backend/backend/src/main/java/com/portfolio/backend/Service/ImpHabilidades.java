
package com.portfolio.backend.Service;

import com.portfolio.backend.InterfaceS.IHabilidadesService;
import com.portfolio.backend.Repository.IHabilidades;
import com.portfolio.backend.entity.EHabilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidades implements IHabilidadesService{
    @Autowired IHabilidades habR;
    @Override
    public List<EHabilidades> verHab() {
        return habR.findAll();
    }

    @Override
    public EHabilidades buscarHab(Long id) {
        return habR.findById(id).orElse(null);
    }

    @Override
    public void crearHab(EHabilidades hab) {
        habR.save(hab);
    }

    @Override
    public void borrarHab(Long id) {
        habR.deleteById(id);
    }
}
