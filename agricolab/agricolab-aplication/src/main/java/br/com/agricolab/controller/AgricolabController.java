package br.com.agricolab.controller;
import br.com.agricolab.repository.model.ConsumerEntity;
import br.com.agricolab.repository.model.ProdutorEntity;
import br.com.agricolab.service.ConsumerService;
import br.com.agricolab.service.ProducerService;
import domain.ConsumerRequest;
import domain.ProducerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agricolab/v1")
public class AgricolabController {


    @Autowired
    ProducerService producerService;

    @Autowired
    ConsumerService consumerService;

    @GetMapping
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello World");
    }


    @PostMapping(path ="/produtor")
    public ResponseEntity<ProdutorEntity> registerProducer(@RequestBody ProducerRequest request) {

        return ResponseEntity.ok(producerService.register(request));
    }

    @PostMapping(path ="/consumidor")
    public ResponseEntity<ConsumerEntity> registerConsumer(@RequestBody ConsumerRequest request) throws Exception {

        return ResponseEntity.ok(consumerService.register(request));
    }

    @PostMapping(path ="/login")
    public ResponseEntity<ConsumerEntity> loginUser(@RequestBody ConsumerRequest request) throws Exception {
        String username = request.getUsername();
        String password = request.getPassword();

        if (username != null && password != null) {
             return ResponseEntity.ok(consumerService.login(username, password));
        }
            return null;
    }
}
    

