package com.mss.service;

import com.mss.dao.ProduitDAO;
import com.mss.dto.ProduitDTO;
import com.mss.mapper.ProduitMapper;
import com.mss.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService{

    @Autowired
    private ProduitMapper produitMapper;


    @Autowired
    private ProduitDAO produitDAO;

    @Override
    public ProduitDTO updateProduit(ProduitDTO produitDTO, String id) {

        Optional<Produit> optional = produitDAO.findById(id);
        if (optional.isPresent()) {
            return save(produitDTO);
        }
        return null;
    }

    @Override
    public ProduitDTO save(ProduitDTO produitDTO) {
        return produitMapper.asDto(produitDAO.save(produitMapper.asEntity(produitDTO)));

    }

    @Override
    public List<ProduitDTO> findAll() {
        return produitMapper.asDtoList(produitDAO.findAll());
    }
}
