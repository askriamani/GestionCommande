package com.mss.service;


import com.mss.dao.ClientDAO;
import com.mss.dao.CommandeDAO;
import com.mss.dto.ClientDTO;
import com.mss.dto.CommandeDTO;
import com.mss.mapper.CommandeMapper;
import com.mss.model.Client;
import com.mss.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeServiceImpl  implements CommandeService{

    @Autowired
private CommandeMapper commandeMapper;

@Autowired
private CommandeDAO commandeDAO;

    @Override
    public List<CommandeDTO> findAll() {
        return commandeMapper.asDtoList(commandeDAO.findAll());
    }



    @Override
    public CommandeDTO save(CommandeDTO commandeDTO) {
        return commandeMapper.asDto(commandeDAO.save(commandeMapper.asEntity(commandeDTO)));
    }

    @Override
    public CommandeDTO updateCommande(CommandeDTO commandeDTO, String id) {
        Optional<Commande> optional = commandeDAO.findById(id);
        if (optional.isPresent()) {
            return save(commandeDTO);
        }
        return null;
    }


}
