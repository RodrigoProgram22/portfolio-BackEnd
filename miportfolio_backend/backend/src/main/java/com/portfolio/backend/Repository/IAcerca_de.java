package com.portfolio.backend.Repository;

import com.portfolio.backend.entity.EAcerca_de;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcerca_de extends JpaRepository<EAcerca_de,Long>{
    
}
