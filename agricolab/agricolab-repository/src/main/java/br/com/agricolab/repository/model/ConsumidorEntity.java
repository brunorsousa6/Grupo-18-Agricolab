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
public class ConsumidorEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_consumidor", nullable=false)
    private Integer idConsumidor;

    @Column(name="nome_consumidor", columnDefinition="VARCHAR", length = 200)
    private String nomeConsumidor;

    @Column(name="email_consumidor", columnDefinition="VARCHAR", length = 100)
    private String emailConsumidor;

    @Column(name="username", columnDefinition="VARCHAR", length = 20)
    private String username;

    @Column(name="senha_consumidor", columnDefinition="VARCHAR", length = 20)
    private String password;

    @Column(name="cpf_consumidor", columnDefinition="VARCHAR", length = 11)
    private String cpfConsumidor;

    @Column(name="telefone_consumidor", columnDefinition="VARCHAR", length = 13)
    private String telefoneConsumidor;

    @Column(name="endereco_consumidor", columnDefinition="VARCHAR", length = 100)
    private String enderecoConsumidor;
}
