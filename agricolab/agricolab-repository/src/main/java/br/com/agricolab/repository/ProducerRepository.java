package br.com.agricolab.repository;


import br.com.agricolab.repository.model.ProdutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends JpaRepository<ProdutorEntity, Long> {
}
