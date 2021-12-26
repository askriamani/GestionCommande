package com.mss.mapper;


import com.mss.dto.ClientDTO;
import com.mss.model.Client;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ClientMapper extends GenericMappper<Client, ClientDTO> {

}
