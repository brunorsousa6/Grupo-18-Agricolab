package br.com.agricolab.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumidor {

    private String username;
    private String nomeConsumidor;
    private String password;
    private String cpfConsumidor;
    private String emailConsumidor;
    private String telefoneConsumidor;
    private String enderecoConsumidor;
}
