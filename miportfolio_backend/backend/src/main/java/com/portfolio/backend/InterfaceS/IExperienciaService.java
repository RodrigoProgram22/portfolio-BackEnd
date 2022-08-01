package com.portfolio.backend.InterfaceS;

import com.portfolio.backend.entity.EExperiencia;
import java.util.List;

public interface IExperienciaService {
    //Traer todos 
    public List<EExperiencia>verExpe();
    //Traer un objeto
    public EExperiencia buscarExpe(Long id);

    //Crear
    public void crearExpe(EExperiencia exp );
    
    //Borrar
    public void borrarExpe(Long id);
}
