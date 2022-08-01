
package com.portfolio.backend.InterfaceS;

import com.portfolio.backend.entity.EEducacion;
import java.util.List;

public interface IEducacionService {
    //Traer todos 
    public List<EEducacion>verEdu();
    //Traer un objeto
    public EEducacion buscarEdu(Long id);
    //Crear
    public void crearEdu(EEducacion edu );
    //Borrar
    public void borrarEdu(Long id);
}
