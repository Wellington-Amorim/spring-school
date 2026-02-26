package com.bn.demo.controllers;

import com.bn.demo.models.AlunoModel;
import com.bn.demo.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController {


    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findAll(){
        return  alunoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AlunoModel> buscaId(@PathVariable Long id) {
        return alunoService.buscaId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        alunoService.deleteById(id);
    }

    @PostMapping
    public AlunoModel criarPessoa(@RequestBody AlunoModel alunoModel){
        return  alunoService.criarPessoa(alunoModel);
    }



}
