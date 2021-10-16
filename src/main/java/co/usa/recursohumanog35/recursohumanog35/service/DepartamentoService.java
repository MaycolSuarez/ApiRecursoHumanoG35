package co.usa.recursohumanog35.recursohumanog35.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursohumanog35.recursohumanog35.model.Departamento;
import co.usa.recursohumanog35.recursohumanog35.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public List<Departamento> getAll() {

        return departamentoRepository.getAll();
    }

    public Optional<Departamento> getDepart(int id) {
        return departamentoRepository.getDepar(id);
    }

    public Departamento save(Departamento dpto) {
        // Verificar si el Id viene Null
        if (dpto.getNumId() == null) {
            return departamentoRepository.save(dpto);
        } else {// Verifico si el Id existe e nl base de DAtos
            Optional<Departamento> consulta = departamentoRepository.getDepar(dpto.getNumId());
            if (consulta.isEmpty()) {
                return departamentoRepository.save(dpto);
            } else {
                return dpto;
            }
        }

    }
}
