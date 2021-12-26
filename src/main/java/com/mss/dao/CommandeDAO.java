package com.mss.dao;

import com.mss.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDAO extends JpaRepository<Commande, String> {
}
