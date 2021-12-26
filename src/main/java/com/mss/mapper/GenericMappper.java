package com.mss.mapper;

import com.mss.dto.ClientDTO;
import com.mss.model.Client;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


public interface GenericMappper<E, D> {

    E asEntity(D dto);
    D asDto(E entity);
    List<D> asDtoList(List<E> entities);
    List<E> asEntityList(List<D> dtos);
}
