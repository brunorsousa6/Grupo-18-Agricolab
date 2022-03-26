package br.com.agricolab.service;

import br.com.agricolab.domain.ConsumidorRequest;
import br.com.agricolab.mapper.ConsumerMapper;
import br.com.agricolab.repository.adapter.ConsumidorRepository;
import br.com.agricolab.repository.model.ConsumidorEntity;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    ConsumidorRepository consumerRepository;

    private final ConsumerMapper mapper = Mappers.getMapper(ConsumerMapper.class);



    public ConsumidorEntity register(ConsumidorRequest request) throws Exception {
        try {
            return consumerRepository.save(mapper.toEntity(request));
        }catch(Exception e){
            throw new Exception("username already exist");
        }

    }

    public ConsumidorEntity login(String username, String password) throws Exception{

        ConsumidorEntity userLogin = consumerRepository.findByUsernameAndPassword(username, password);

        if (userLogin == null){
            throw new Exception("bad credentials");
        }

        return userLogin;

    }

}
