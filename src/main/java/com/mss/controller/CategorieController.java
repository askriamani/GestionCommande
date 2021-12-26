package com.mss.controller;

import com.mss.dto.CategorieDTO;
import com.mss.dto.CommandeDTO;
import com.mss.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("categorie")

public class CategorieController {


    @Autowired
    private CategorieService categorieService;


    @GetMapping("/categories")
    public List<CategorieDTO> getAllCategorie() {
        return categorieService.findAll();
    }


    @PostMapping("/add")
    public CategorieDTO CreateCategorie(@RequestBody CategorieDTO categorieDTO) {
        return categorieService.save(categorieDTO);
    }

    @PutMapping("/update/{id}")
    public CategorieDTO updateCategorie(@PathVariable(value = "id") String id, @RequestBody CategorieDTO categorieDTO) {
        return categorieService.updateCategorie(categorieDTO,id);

    }

}
