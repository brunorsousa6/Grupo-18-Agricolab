package br.com.agricolab.mapper;


import br.com.agricolab.repository.model.ConsumerEntity;
import br.com.agricolab.repository.model.ProdutorEntity;
import domain.ConsumerRequest;
import domain.ProducerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ConsumerMapper {

    ConsumerEntity toEntity(ConsumerRequest consumerRequest);

    @Mapping(source = "consumerEntity.nomeConsumidor", target="nomeProdutor")
    @Mapping(source = "consumerEntity.emailConsumidor", target="emailProdutor")
    @Mapping(source = "consumerEntity.password", target="senhaProdutor")
    @Mapping(source = "consumerEntity.cpfConsumidor", target="cpfProdutor")
    @Mapping(source = "consumerEntity.telefoneConsumidor", target="telefoneProdutor")
    @Mapping(source = "consumerEntity.enderecoConsumidor", target="enderecoProdutor")
    @Mapping(source = "request.cnpjProdutor", target="cnpjProdutor")
    @Mapping(source =" consumerEntity.username", target = "username")
    ProdutorEntity toProdutorEntity(ConsumerEntity consumerEntity, ProducerRequest request);

}
