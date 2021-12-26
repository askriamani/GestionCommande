package com.mss.controller;


import com.mss.dto.ClientDTO;
import com.mss.dto.CommandeDTO;
import com.mss.service.ClientService;
import com.mss.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commande")

public class CommandeController {

    @Autowired
    private CommandeService commandeService;


    @GetMapping("/commandes")
    public List<CommandeDTO> getAllCommande() {
        return commandeService.findAll();
    }


    @PostMapping("/add")
    public CommandeDTO CreateCommande(@RequestBody CommandeDTO commandeDTO) {
        return commandeService.save(commandeDTO);
    }

    @PutMapping("/update/{id}")
    public CommandeDTO updateCommande(@PathVariable(value = "id") String id,@RequestBody CommandeDTO commandeDTO) {
        return commandeService.updateCommande(commandeDTO,id);

    }

}
