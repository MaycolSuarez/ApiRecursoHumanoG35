package co.usa.recursohumanog35.recursohumanog35.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursohumanog35.recursohumanog35.model.Empleado;
import co.usa.recursohumanog35.recursohumanog35.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getAll(){
        return empleadoRepository.getAll();
    }

    public Optional<Empleado> getEmpleado( int id){
        return empleadoRepository.getEmpleado(id);
    }

    public Empleado saveEmpleado(Empleado empl){
        if (empl.getNumId()==null) {
            return empleadoRepository.saveEm(empl);
        }else{
            Optional<Empleado>consulta=empleadoRepository.getEmpleado(empl.getNumId());
            if (consulta.isEmpty()) {
                return empleadoRepository.saveEm(empl);
                
            } else{
                return empl;
            }
        }
        
    }

}
