
package com.portfolio.backend.Service;

import com.portfolio.backend.InterfaceS.IExperienciaService;
import com.portfolio.backend.Repository.IExperiencia;
import com.portfolio.backend.entity.EExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperiencia implements IExperienciaService{
      @Autowired 
    IExperiencia experienciaR; 
    
    @Override
    public List<EExperiencia> verExpe() {
        return experienciaR.findAll();
    }

    @Override
    public EExperiencia buscarExpe(Long id) {
       return experienciaR.findById(id).orElse(null);
    }

    @Override
    public void crearExpe(EExperiencia exp) {
        experienciaR.save(exp);
    }

    @Override
    public void borrarExpe(Long id) {
       experienciaR.deleteById(id);
    }
}
