package com.mss.service;

import com.mss.dto.CommandeDTO;

import java.util.List;

public interface CommandeService {
    List<CommandeDTO> findAll();

    CommandeDTO save(CommandeDTO commandeDTO);

    CommandeDTO updateCommande(CommandeDTO commandeDTO, String id);

    void delete(String id);
}
