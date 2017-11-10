package com.dogify.repository;

import org.springframework.data.repository.CrudRepository;

import com.dogify.domain.Perro;

public interface PerroRepository extends CrudRepository<Perro, Long> {

}
