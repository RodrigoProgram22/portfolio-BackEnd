
package com.portfolio.backend.Repository;
import com.portfolio.backend.entity.EEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacion extends JpaRepository<EEducacion, Long >{
    
}
