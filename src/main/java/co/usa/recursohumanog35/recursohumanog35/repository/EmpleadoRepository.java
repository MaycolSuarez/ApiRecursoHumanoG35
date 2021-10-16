package co.usa.recursohumanog35.recursohumanog35.repository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumanog35.recursohumanog35.model.Empleado;
import co.usa.recursohumanog35.recursohumanog35.repository.crud.EmpleadoCrudRepository;

@Repository
public class EmpleadoRepository {
    @Autowired
    
    private EmpleadoCrudRepository empleadoCrudRepository;

    public List<Empleado> getAll(){
        return (List<Empleado>)empleadoCrudRepository.findAll();
    }

    public Optional<Empleado> getEmpleado(int id){
        return empleadoCrudRepository.findById(id);
    }

    public Empleado saveEm(Empleado empl){
        return empleadoCrudRepository.save(empl);
    }

    
}
