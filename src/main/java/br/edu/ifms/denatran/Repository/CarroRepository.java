package br.edu.ifms.denatran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.denatran.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{

	
}
