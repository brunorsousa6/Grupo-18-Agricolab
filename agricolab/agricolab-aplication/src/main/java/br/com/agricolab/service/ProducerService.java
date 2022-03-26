package br.com.agricolab.service;

import br.com.agricolab.mapper.ConsumerMapper;
import br.com.agricolab.repository.ConsumerRepository;
import br.com.agricolab.repository.ProducerRepository;
import br.com.agricolab.repository.model.ConsumerEntity;
import br.com.agricolab.repository.model.ProdutorEntity;
import domain.ProducerRequest;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    ConsumerRepository consumerRepository;

    @Autowired
    ProducerRepository producerRepository;

    private ConsumerMapper mapper = Mappers.getMapper(ConsumerMapper.class);




    public ProdutorEntity register(ProducerRequest request) {

        ConsumerEntity consumerEntity = consumerRepository.findByUsername(request.getUsername());

        ProdutorEntity produtorEntity = mapper.toProdutorEntity(consumerEntity, request);

        return producerRepository.save(produtorEntity);

    }
}
