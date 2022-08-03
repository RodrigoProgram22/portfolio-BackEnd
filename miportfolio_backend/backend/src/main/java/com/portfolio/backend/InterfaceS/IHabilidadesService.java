
package com.portfolio.backend.InterfaceS;

import com.portfolio.backend.entity.EHabilidades;
import java.util.List;


public interface IHabilidadesService {
    public List<EHabilidades>verHab();
    public EHabilidades buscarHab(Long id);
    public void crearHab(EHabilidades hab);
    public void borrarHab(Long id);
}
