package com.mss.mapper;

import com.mss.dto.ProduitDTO;
import com.mss.model.Produit;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProduitMapper extends GenericMappper<Produit, ProduitDTO> {
}
