package com.mss.service;

import com.mss.dto.ClientDTO;

import java.util.List;

public interface ClientService  {

    void deleteById(Long code);

    ClientDTO update(ClientDTO clientDTO, String code);


    List<ClientDTO> findAll();

    ClientDTO save(ClientDTO clientDTO);
    ClientDTO findByCode(String code);
}
