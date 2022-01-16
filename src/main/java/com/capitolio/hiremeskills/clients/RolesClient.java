package com.capitolio.hiremeskills.clients;

import com.capitolio.hiremeskills.dtos.RoleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="hireme-companies", path = "/roles")
public interface RolesClient {

    @GetMapping("/{id}")
    ResponseEntity<RoleDto> retrieveById(@PathVariable Long id);

}
