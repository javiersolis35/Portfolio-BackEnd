
package com.PortfolioAP.Portfolio.Security.Repository;

import com.PortfolioAP.Portfolio.Security.Entity.Rol;
import com.PortfolioAP.Portfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
