package br.com.agricolab.repository;


import br.com.agricolab.repository.model.ConsumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<ConsumerEntity, Long> {

    ConsumerEntity findByUsername(String userName);

    ConsumerEntity findByUsernameAndPassword(String username, String password);

}
