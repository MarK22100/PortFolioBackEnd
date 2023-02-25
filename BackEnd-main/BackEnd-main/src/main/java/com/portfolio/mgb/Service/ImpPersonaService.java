package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.IPersonaService;
import com.portfolio.mgb.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired 
            IPersonaRepository ipersonrepo;
    @Override
    public List<Persona> getPersona() {
       List<Persona>person = ipersonrepo.findAll();
        return person;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonrepo.save(persona);
    }


    @Override
    public Persona findPersona(Long id) {
        Persona person = (Persona) ipersonrepo.findById(id);
        return person;
    }

    @Override
    public void deletePersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
