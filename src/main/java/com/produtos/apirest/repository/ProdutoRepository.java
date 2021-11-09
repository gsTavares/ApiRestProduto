/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marketing
 */

// JpaRepository --> vários métodos prontos para persistência em banco de dados

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    Produto findById(long id);
    
}
