package br.com.agricolab.repository.adapter;

import br.com.agricolab.repository.model.ConsumidorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumidorRepository extends JpaRepository<ConsumidorEntity, Long> {

    ConsumidorEntity findByUsername(String userName);

    ConsumidorEntity findByUsernameAndPassword(String username, String password);

}
