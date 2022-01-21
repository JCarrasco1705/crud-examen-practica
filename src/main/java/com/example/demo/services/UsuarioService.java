package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioDto> obtenerUsuarios(){
        return (ArrayList<UsuarioDto>) usuarioRepository.findAll();
    }

    public UsuarioDto guardarUsuario(UsuarioDto usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioDto> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }


    public ArrayList<UsuarioDto>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}