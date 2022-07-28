package com.portfolio.backend.Repository;

import com.portfolio.backend.entity.EExperiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperiencia extends JpaRepository<EExperiencia,Long>{
    
}
