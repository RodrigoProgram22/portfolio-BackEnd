
package com.portfolio.backend.Service;

import com.portfolio.backend.InterfaceS.IProyectoService;
import com.portfolio.backend.Repository.IProyecto;
import com.portfolio.backend.entity.EProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyecto implements IProyectoService{
    @Autowired IProyecto proyecR;
    
    @Override
    public List<EProyecto> verProyec() {
        return proyecR.findAll();
    }

    @Override
    public EProyecto buscarProyec(Long id) {
        return proyecR.findById(id).orElse(null);
    }

    @Override
    public void crearProyec(EProyecto proy) {
        proyecR.save(proy);
    }

    @Override
    public void borrarProyec(Long id) {
        proyecR.deleteById(id);
    }
    
}
