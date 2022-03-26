package br.com.agricolab.mapper;

import br.com.agricolab.domain.ConsumidorRequest;
import br.com.agricolab.domain.ProdutorRequest;
import br.com.agricolab.repository.model.ConsumidorEntity;
import br.com.agricolab.repository.model.ProdutorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ConsumerMapper {

    ConsumidorEntity toEntity(ConsumidorRequest consumerRequest);

    @Mapping(source = "consumerEntity.nomeConsumidor", target="nomeProdutor")
    @Mapping(source = "consumerEntity.emailConsumidor", target="emailProdutor")
    @Mapping(source = "consumerEntity.password", target="senhaProdutor")
    @Mapping(source = "consumerEntity.cpfConsumidor", target="cpfProdutor")
    @Mapping(source = "consumerEntity.telefoneConsumidor", target="telefoneProdutor")
    @Mapping(source = "consumerEntity.enderecoConsumidor", target="enderecoProdutor")
    @Mapping(source = "request.cnpjProdutor", target="cnpjProdutor")
    @Mapping(source =" consumerEntity.username", target = "username")
    ProdutorEntity toProdutorEntity(ConsumidorEntity consumerEntity, ProdutorRequest request);

}
