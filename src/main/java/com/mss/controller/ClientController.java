package com.mss.controller;

import com.mss.dto.ClientDTO;
import com.mss.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("client")

public class ClientController {



    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<ClientDTO> getAllClients() {
        return clientService.findAll();
    }

    //create client
    @PostMapping("/add")
    public ClientDTO CreateClient(@RequestBody ClientDTO clientDTO)
    {
        return clientService.save(clientDTO);
    }

    @PutMapping("/update/{id}")
    public ClientDTO updateClient(@PathVariable(value = "id") String code,@RequestBody ClientDTO clientDTO) {
       return clientService.update(clientDTO,code);

    }


}
