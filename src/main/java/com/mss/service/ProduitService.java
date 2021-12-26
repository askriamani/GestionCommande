package com.mss.service;

import com.mss.dto.ProduitDTO;

import java.util.List;

public interface ProduitService {
    ProduitDTO updateProduit(ProduitDTO produitDTO, String id);

    ProduitDTO save(ProduitDTO produitDTO);

    List<ProduitDTO> findAll();
}
