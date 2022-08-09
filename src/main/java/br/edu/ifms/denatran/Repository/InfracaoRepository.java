package br.edu.ifms.denatran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.denatran.model.Infracao;

@Repository
public interface InfracaoRepository extends JpaRepository<Infracao, Integer>{

	
}
