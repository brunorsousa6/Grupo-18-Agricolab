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
@Table(name="consumers", uniqueConstraints={@UniqueConstraint(columnNames={"username"})})
public class ConsumerEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nome_consumidor", length = 200)
    private String nomeConsumidor;

    @Column(name="username", length = 200, unique = true)
    private String username;

    @Column(name="email_consumidor", length = 100)
    private String emailConsumidor;

    @Column(name="senha_consumidor", length = 14)
    private String password;

    @Column(name="cpf_consumidor", length = 11)
    private String cpfConsumidor;

    @Column(name="telefone_consumidor", length = 13)
    private String telefoneConsumidor;

    @Column(name="endereco_consumidor", length = 100)
    private String enderecoConsumidor;
}
