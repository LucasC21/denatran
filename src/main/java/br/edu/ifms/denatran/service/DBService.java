package br.edu.ifms.denatran.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.denatran.repository.CarroRepository;

@Service
public class DBService {

	@Autowired
	private CarroRepository carro;
	
	public void instantiateTestDatabase() throws ParseException{

	}
}
