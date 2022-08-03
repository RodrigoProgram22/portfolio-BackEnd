
package com.portfolio.backend.Repository;

import com.portfolio.backend.entity.EHabilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidades extends JpaRepository<EHabilidades, Long>{
    
}
