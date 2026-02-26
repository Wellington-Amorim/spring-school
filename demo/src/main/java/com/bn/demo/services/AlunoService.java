package com.bn.demo.services;

import com.bn.demo.models.AlunoModel;
import com.bn.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {


    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll(){
        return  alunoRepository.findAll();
    }

    public AlunoModel criarPessoa(AlunoModel alunoModel){
        return  alunoRepository.save(alunoModel);
    }

    public Optional<AlunoModel> buscaId(Long id) {
        return alunoRepository.findById(id);
    }


    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }
}
