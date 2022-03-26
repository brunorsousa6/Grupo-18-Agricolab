package br.com.agricolab.controller;

import br.com.agricolab.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agricolab")
public class AgricolabController {

    @GetMapping("/hello-admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<MessageDto> helloAdmin() {
        return ResponseEntity.ok(new MessageDto("hola ADMIN desde cognito"));
    }

    @GetMapping("/hello-user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<MessageDto> helloUser() {
        return ResponseEntity.ok(new MessageDto("hola USER desde cognito"));
    }
}
