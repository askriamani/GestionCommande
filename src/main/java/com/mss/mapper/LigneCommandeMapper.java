package com.mss.mapper;

import com.mss.dto.LigneCommandeDTO;
import com.mss.model.LigneCommande;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface LigneCommandeMapper extends GenericMappper<LigneCommande, LigneCommandeDTO> {
}
