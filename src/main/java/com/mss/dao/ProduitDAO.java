package com.mss.dao;

import com.mss.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitDAO  extends JpaRepository<Produit, String> {
}
