package com.laura.seguridad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laura.seguridad.models.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Long>{
    
}
