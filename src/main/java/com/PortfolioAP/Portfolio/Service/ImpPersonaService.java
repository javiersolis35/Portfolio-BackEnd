
package com.PortfolioAP.Portfolio.Service;

import com.PortfolioAP.Portfolio.Entity.Persona;
import com.PortfolioAP.Portfolio.Interface.IPersonaService;
import com.PortfolioAP.Portfolio.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaService implements IPersonaService {
      @Autowired IPersonaRepository ipersonaRepository;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
        
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);

    }

    @Override
    public Persona finPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
                return persona;
        
    }
    
}
