package com.evetoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.evetoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
