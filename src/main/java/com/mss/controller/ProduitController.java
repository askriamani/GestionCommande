package com.mss.controller;

import com.mss.dto.CategorieDTO;
import com.mss.dto.ProduitDTO;
import com.mss.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produit")

public class ProduitController {

@Autowired
private ProduitService produitService;


    @GetMapping("/produits")
    public List<ProduitDTO> getAllProduits() {
        return produitService.findAll();
    }


    @PostMapping("/add")
    public ProduitDTO CreateProduit(@RequestBody ProduitDTO produitDTO) {
        return produitService.save(produitDTO);
    }

    @PutMapping("/update/{id}")
    public ProduitDTO updateProduit(@PathVariable(value = "id") String id, @RequestBody ProduitDTO produitDTO) {
        return produitService.updateProduit(produitDTO,id);

    }

}
