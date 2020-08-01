package com.evetoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.evetoapp.models.Convidado;
import com.evetoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);

}
