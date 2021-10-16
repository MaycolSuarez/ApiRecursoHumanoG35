package co.usa.recursohumanog35.recursohumanog35.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import co.usa.recursohumanog35.recursohumanog35.repository.crud.DepartamentoCrudRepository;
import co.usa.recursohumanog35.recursohumanog35.model.Departamento;
@Repository
public class DepartamentoRepository {
    @Autowired
    DepartamentoCrudRepository departamentoCrudRepository;

    public List<Departamento> getAll() {
        return (List<Departamento>) departamentoCrudRepository.findAll();
    }

    public Optional<Departamento> getDepar(int id) {
        return departamentoCrudRepository.findById(id);
    }

    public Departamento save(Departamento dpto) {
        return departamentoCrudRepository.save(dpto);
    }
}
