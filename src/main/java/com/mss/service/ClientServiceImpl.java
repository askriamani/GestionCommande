package com.mss.service;

import com.mss.dao.ClientDAO;
import com.mss.dto.ClientDTO;
import com.mss.mapper.ClientMapper;
import com.mss.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("clientservice")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientDAO clientDao;


    @Override
    public void deleteById(Long code) {

    }



    @Override
    public ClientDTO update(ClientDTO clientDTO, String code) {
        Optional<Client> optional = clientDao.findById(code);
        if (optional.isPresent()) {
            return save(clientDTO);
        }
        return null;
    }

    @Override
    public List<ClientDTO> findAll() {
        return clientMapper.asDtoList(clientDao.findAll());
    }

    @Override
    public ClientDTO save(ClientDTO clientDTO) {
        return clientMapper.asDto(clientDao.save(clientMapper.asEntity(clientDTO)));
    }

    @Override
    public ClientDTO findByCode(String code) {
        return null;
    }

//    public ClientDTO findByCode(String code) {
//        Optional<Client> optional = clientDao.findById(code);
//        return optional.map(client -> clientMapper.asDto(client)).orElse(null);
//    }


}
