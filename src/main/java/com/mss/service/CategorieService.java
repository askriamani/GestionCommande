package com.mss.service;

import com.mss.dto.CategorieDTO;
import com.mss.dto.CommandeDTO;

import java.util.List;

public interface CategorieService {
    List<CategorieDTO> findAll();

    CategorieDTO save(CategorieDTO categorieDTO);

    CategorieDTO updateCategorie(CategorieDTO categorieDTO, String id);
}
