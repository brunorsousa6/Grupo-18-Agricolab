package br.com.agricolab.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "produtores")
public class ProdutorEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_produtor", nullable=false)
    private Integer idProdutor;

    @Column(name="nome_produtor", columnDefinition="VARCHAR", length = 200)
    private String nomeProdutor;

    @Column(name="email_produtor", columnDefinition="VARCHAR", length = 100)
    private String emailProdutor;

    @Column(name="senha_produtor", columnDefinition="VARCHAR", length = 20)
    private String senhaProdutor;

    @Column(name="cnpj_produtor", columnDefinition="VARCHAR", length = 14)
    private String cnpjProdutor;

    @Column(name="cpf_produtor", columnDefinition="VARCHAR", length = 11)
    private String cpfProdutor;

    @Column(name="telefone_produtor", columnDefinition="VARCHAR", length = 13)
    private String telefoneProdutor;

    @Column(name="endereco_produtor", columnDefinition="VARCHAR", length = 100)
    private String enderecoProdutor;

}
