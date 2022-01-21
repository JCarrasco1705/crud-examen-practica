package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.dto.UsuarioDto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioDto, Long> {
    public abstract ArrayList<UsuarioDto> findByPrioridad(Integer prioridad);

}