package com.mss.mapper;

import com.mss.dto.CategorieDTO;
import com.mss.model.Categorie;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CategorieMapper extends GenericMappper<Categorie , CategorieDTO> {
}
