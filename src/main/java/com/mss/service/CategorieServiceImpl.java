package com.mss.service;

import com.mss.dao.CategorieDAO;
import com.mss.dto.CategorieDTO;
import com.mss.dto.ClientDTO;
import com.mss.dto.CommandeDTO;
import com.mss.mapper.CategorieMapper;
import com.mss.model.Categorie;
import com.mss.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImpl  implements  CategorieService{

    @Autowired
    private CategorieMapper categorieMapper;

    @Autowired
    private CategorieDAO categorieDAO;



    @Override
    public List<CategorieDTO> findAll() {
        return categorieMapper.asDtoList(categorieDAO.findAll());
    }


    @Override
    public CategorieDTO save(CategorieDTO categorieDTO) {
        return categorieMapper.asDto(categorieDAO.save(categorieMapper.asEntity(categorieDTO)));
    }

    @Override
    public CategorieDTO updateCategorie(CategorieDTO categorieDTO, String id) {
        Optional<Categorie> optional = categorieDAO.findById(id);
        if (optional.isPresent()) {
            return save(categorieDTO);
        }
        return null;
    }
}
