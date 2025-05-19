package com.renanfagundes.santanderdevweek.controller;

import com.renanfagundes.santanderdevweek.entity.Cliente;
import com.renanfagundes.santanderdevweek.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@Valid @RequestBody Cliente cliente) {
        Cliente salvo = clienteRepository.save(cliente);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }
}
