package com.api.helpr.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.helpr.domain.Cliente;
import com.api.helpr.domain.Tecnico;
import com.api.helpr.domain.dtos.ClienteDTO;
import com.api.helpr.domain.dtos.TecnicoDTO;
import com.api.helpr.services.ClienteService;


@RestController
@RequestMapping(value = "/service/clientes")
 

public class ClientesResource {
	
@Autowired 

private ClienteService service; 

@GetMapping (value = "/{id}")
public ResponseEntity<ClienteDTO> findById (@PathVariable Integer id){
Cliente obj = service.findById (id);
return ResponseEntity.ok().body(new ClienteDTO(obj));
} 
}



