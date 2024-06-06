package com.pichincha.serviciocliente.domain.port.out.db;

import com.pichincha.serviciocliente.application.dto.ClienteDTO;
import com.pichincha.serviciocliente.infrastructure.adapter.out.db.model.ClienteEntity;
import com.pichincha.serviciocliente.infrastructure.common.exception.BussinesRuleException;
import com.pichincha.serviciocliente.infrastructure.common.exception.BussinesRuleValidationException;
import java.util.List;
import org.springframework.validation.BindingResult;

/**
 *
 * @author Santiago Betancur
 */
public interface ClienteService {

    public ClienteEntity findById(Long id) throws BussinesRuleException;

    public List<ClienteEntity> findAll();

    public ClienteEntity save(ClienteDTO clienteDTO, BindingResult result) throws BussinesRuleValidationException;

    public void put(ClienteDTO clienteDTO, BindingResult result, Long id) throws BussinesRuleException, BussinesRuleValidationException;

    public void delete(Long id) throws BussinesRuleException;
}
