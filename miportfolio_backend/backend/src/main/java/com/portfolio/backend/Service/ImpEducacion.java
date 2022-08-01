
package com.portfolio.backend.Service;
import com.portfolio.backend.InterfaceS.IEducacionService;
import com.portfolio.backend.Repository.IEducacion;
import com.portfolio.backend.entity.EEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacion implements IEducacionService{
    @Autowired IEducacion eduR;

    @Override
    public List<EEducacion> verEdu() {
        return eduR.findAll();
    }

    @Override
    public EEducacion buscarEdu(Long id) {
       return eduR.findById(id).orElse(null);
    }

    @Override
    public void crearEdu(EEducacion edu) {
        eduR.save(edu);
    }

    @Override
    public void borrarEdu(Long id) {
       eduR.deleteById(id);
    }
}
