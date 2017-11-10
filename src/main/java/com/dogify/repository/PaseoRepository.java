package com.dogify.repository;

import org.springframework.data.repository.CrudRepository;

import com.dogify.domain.Usuario;

public interface PaseoRepository extends CrudRepository<Usuario, Long> {

}
