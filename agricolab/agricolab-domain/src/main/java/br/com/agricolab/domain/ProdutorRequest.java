package br.com.agricolab.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutorRequest {

    private String username;
    private Integer id;
    private String nomeprodutor;
    private String password;
    private String emailProdutor;
    private String senhaProdutor;
    private String cnpjProdutor;
    private String cpfProdutor;
    private String telefoneProdutor;
    private String EnderecoProdutor;
}
