package com.B2B2C.Application.controller;

import com.B2B2C.Application.dto.NegocioPost;
import com.B2B2C.Application.model.Negocio;
import com.B2B2C.Application.services.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/negocio")
public class NegocioRestController  {
    @Autowired
    private NegocioService negocioService;

    @GetMapping
    public ResponseEntity<?> buscarTodosNegocios() {
        List negocios= new ArrayList<Negocio>();
        this.negocioService.buscarTodosNegocios().forEach(negocios::add);
        return ResponseEntity.status(HttpStatus.OK).body(negocios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarNegocioPorId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.negocioService.buscarNegocioPorId(id));
    }

    @PostMapping
    public ResponseEntity<String> novoNegocioNoBD(@RequestBody NegocioPost negocioPost){
        this.negocioService.novoNegocioNoBD(negocioPost);
        return ResponseEntity.status(HttpStatus.OK).body("Salvo com Sucesso");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDonoNoBD(@PathVariable Long id){
        //System.out.println("TESTANDO " + id);
        this.negocioService.deletarNegocioNoBD(id);
        return ResponseEntity.ok().build();
    }
}
