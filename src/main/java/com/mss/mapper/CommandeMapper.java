package com.mss.mapper;

import com.mss.dto.CommandeDTO;
import com.mss.model.Commande;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CommandeMapper extends GenericMappper<Commande, CommandeDTO> {
}
