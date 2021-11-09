/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marketing
 */
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    // Listar
    @GetMapping("/produtos")
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    // Carregar
    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Retorna apenas um produto")
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    // Salvar
    @PostMapping("/produto")
    @ApiOperation(value = "Salva um novo produto")
    public Produto salvaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // Deletar
    @DeleteMapping("/produto")
    @ApiOperation(value = "Deleta um produto")
    public void deletaProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    // Atualizar
    @PutMapping("/produto")
    @ApiOperation(value = "Atualiza um produto")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

}
