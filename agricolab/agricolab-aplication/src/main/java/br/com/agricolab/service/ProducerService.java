package br.com.agricolab.service;

import br.com.agricolab.domain.ProdutorRequest;
import br.com.agricolab.mapper.ConsumerMapper;
import br.com.agricolab.repository.adapter.ConsumidorRepository;
import br.com.agricolab.repository.adapter.ProdutorRepository;
import br.com.agricolab.repository.model.ConsumidorEntity;
import br.com.agricolab.repository.model.ProdutorEntity;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    ConsumidorRepository consumerRepository;

    @Autowired
    ProdutorRepository producerRepository;

    private ConsumerMapper mapper = Mappers.getMapper(ConsumerMapper.class);


    public ProdutorEntity register(ProdutorRequest request) {

        ConsumidorEntity consumerEntity = consumerRepository.findByUsername(request.getUsername());

        ProdutorEntity produtorEntity = mapper.toProdutorEntity(consumerEntity, request);

        return producerRepository.save(produtorEntity);

    }
}
