
package com.portfolio.backend.InterfaceS;

import com.portfolio.backend.entity.EProyecto;
import java.util.List;


public interface IProyectoService {
    public List<EProyecto>verProyec();
    public EProyecto buscarProyec(Long id);
    public void crearProyec(EProyecto proy);
    public void borrarProyec(Long id);
}
