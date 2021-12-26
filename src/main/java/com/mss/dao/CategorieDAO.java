package com.mss.dao;

import com.mss.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDAO extends JpaRepository<Categorie, String> {
}
