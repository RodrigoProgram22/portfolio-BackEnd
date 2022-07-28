package com.portfolio.backend.Service;

import com.portfolio.backend.InterfaceS.IAcerca_deService;
import com.portfolio.backend.Repository.IAcerca_de;
import com.portfolio.backend.entity.EAcerca_de;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpAcerca_deService implements IAcerca_deService{
    @Autowired 
    IAcerca_de acerca_deR; 
    
    @Override
    public EAcerca_de buscarAcercaDe(Long id) {
        return acerca_deR.findById(id).orElse(null);
    }

    @Override
    public void crearAcercaDe(EAcerca_de acerca_de) {
        acerca_deR.save(acerca_de);
    }

    @Override
    public void borrarAcercaDe(Long id) {
        acerca_deR.deleteById(id);
    }
}
