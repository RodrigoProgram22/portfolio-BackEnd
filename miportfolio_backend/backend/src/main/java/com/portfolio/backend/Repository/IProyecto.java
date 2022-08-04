
package com.portfolio.backend.Repository;

import com.portfolio.backend.entity.EProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyecto extends JpaRepository<EProyecto, Long>{
    
}
