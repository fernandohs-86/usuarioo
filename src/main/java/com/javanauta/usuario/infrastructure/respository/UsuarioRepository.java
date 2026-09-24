package com.javanauta.usuario.infrastructure.respository;


import com.javanauta.usuario.infrastructure.entity.Usuario;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email);
    // essa anotaçao obrigatoria transactional ajuda a nao da erro na hora de deletar
    @Transactional
    void deleteByEmail(String email);
}


