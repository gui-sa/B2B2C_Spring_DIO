package com.B2B2C.Application.controller;

import com.B2B2C.Application.dto.DonoPost;
import com.B2B2C.Application.model.Dono;
import com.B2B2C.Application.services.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dono")
public class DonoRestController {
    @Autowired
    private DonoService donoService;
   // @Autowired
    //Dono dono;
    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        List donos= new ArrayList<Dono>();
        this.donoService.buscarTodos().forEach(donos::add);
        return ResponseEntity.status(HttpStatus.OK).body(donos);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.donoService.buscarPorId(id));
    }
/**
    @PostMapping
    public ResponseEntity<String> novoDono(@RequestBody DonoPost donoPost) {
        this.donoService.novoDono(donoPost.getDono(dono));
        return ResponseEntity.status(HttpStatus.CREATED).body("Salvo com Sucesso");
    }
*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDonoNoBD(@PathVariable Long id){
        this.donoService.deletarDonoNoBD(id);
        return ResponseEntity.ok().build();
    }

}
