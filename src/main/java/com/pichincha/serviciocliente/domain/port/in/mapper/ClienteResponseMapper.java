/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pichincha.serviciocliente.domain.port.in.mapper;

import com.pichincha.serviciocliente.application.dto.ClienteDTO;
import com.pichincha.serviciocliente.infrastructure.adapter.out.db.model.ClienteEntity;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author rizzoli
 */
@Mapper(componentModel = "spring")
public interface ClienteResponseMapper {
    
    //fuente ClienteDTO destino ClienteEntity
    @Mappings({
        @Mapping(target = "idCliente", ignore = true)
    })
    ClienteEntity toClienteEntity(ClienteDTO c);
    List<ClienteEntity> toListClienteEntity(List<ClienteDTO> customers);
    
    //fuente ClienteEntity destino ClienteDTO
    @InheritInverseConfiguration
    @Mappings({})
    ClienteDTO toClienteDTORequest(ClienteEntity c);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "idCliente", ignore = true)
    })        
    List<ClienteDTO> toListClienteDTORequest(List<ClienteEntity> customers);
}
