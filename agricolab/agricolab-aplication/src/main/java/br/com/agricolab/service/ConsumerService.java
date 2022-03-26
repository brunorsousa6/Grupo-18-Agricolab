package br.com.agricolab.service;


import br.com.agricolab.mapper.ConsumerMapper;
import br.com.agricolab.repository.ConsumerRepository;
import br.com.agricolab.repository.model.ConsumerEntity;
import domain.ConsumerRequest;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    ConsumerRepository consumerRepository;

    private final ConsumerMapper mapper = Mappers.getMapper(ConsumerMapper.class);



    public ConsumerEntity register(ConsumerRequest request) throws Exception {
       try {
           return consumerRepository.save(mapper.toEntity(request));
       }catch(Exception e){
           throw new Exception("username already exist");
       }

    }

    public ConsumerEntity login(String username, String password) throws Exception{

        ConsumerEntity userLogin = consumerRepository.findByUsernameAndPassword(username, password);

        if (userLogin == null){
            throw new Exception("bad credentials");
        }

        return userLogin;

    }

}

