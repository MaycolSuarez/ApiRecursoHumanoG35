package co.usa.recursohumanog35.recursohumanog35.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.usa.recursohumanog35.recursohumanog35.model.Empleado;
import co.usa.recursohumanog35.recursohumanog35.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/all")
    public List<Empleado>getEmpleados(){
        return empleadoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Empleado>GetEmpleado(@PathVariable int id){

        return empleadoService.getEmpleado(id);

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado saveEmpleado(@RequestBody Empleado empl){
        return empleadoService.saveEmpleado(empl);
    }

}
