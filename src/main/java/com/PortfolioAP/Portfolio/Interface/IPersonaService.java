
package com.PortfolioAP.Portfolio.Interface;

import com.PortfolioAP.Portfolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    
    //Eliminar un objeti pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona finPersona(Long id);
    
    
}
