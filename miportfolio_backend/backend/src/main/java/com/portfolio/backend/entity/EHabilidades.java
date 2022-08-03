
package com.portfolio.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EHabilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_hab;
    
    private String nombre_hab;
    private int nivel_hab;
    private String enlace;
    private String logo_hab;
}
