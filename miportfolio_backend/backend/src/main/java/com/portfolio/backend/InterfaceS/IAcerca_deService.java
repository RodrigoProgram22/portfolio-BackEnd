
package com.portfolio.backend.InterfaceS;

import com.portfolio.backend.entity.EAcerca_de;


public interface IAcerca_deService {
    //Traer un objeto
    public EAcerca_de buscarAcercaDe(Long id);

    //Crear
    public void crearAcercaDe(EAcerca_de acerca_de);
    
    //Borrar
    public void borrarAcercaDe(Long id);
}
