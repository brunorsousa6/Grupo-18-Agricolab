package br.com.agricolab.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="producers")
public class ProdutorEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nome_produtor", length = 200)
    private String nomeProdutor;

    @Column(name="username", length = 200)
    private String username;

    @Column(name="email_produtor", length = 100)
    private String emailProdutor;

    @Column(name="cnpj_produtor", length = 14)
    private String cnpjProdutor;

    @Column(name="senha_produtor", length = 14)
    private String senhaProdutor;

    @Column(name="cpf_produtor", length = 11)
    private String cpfProdutor;

    @Column(name="telefone_produtor", length = 13)
    private String telefoneProdutor;

    @Column(name="endereco_produtor", length = 100)
    private String enderecoProdutor;

}
