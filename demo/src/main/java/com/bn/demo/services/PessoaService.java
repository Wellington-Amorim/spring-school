package com.bn.demo.services;

import com.bn.demo.models.PessoaModel;
import com.bn.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return  pessoaRepository.findAll();
    }

    public PessoaModel criar(PessoaModel pessoaModel){
        return  pessoaRepository.save(pessoaModel);
    }

}
