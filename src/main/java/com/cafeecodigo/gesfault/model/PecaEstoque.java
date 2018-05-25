/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafeecodigo.gesfault.model;

import java.util.UUID;

/**
 *
 * @author kelvin
 */
public class PecaEstoque {
    private UUID idPecaEstoque;
    private PecaFornecedor pecaFornecedor;
    private int quantidade;

    public UUID getIdPecaEstoque() {
        return idPecaEstoque;
    }

    public void setIdPecaEstoque(UUID idPecaEstoque) {
        this.idPecaEstoque = idPecaEstoque;
    }

    public PecaFornecedor getPecaFornecedor() {
        return pecaFornecedor;
    }

    public void setPecaFornecedor(PecaFornecedor pecaFornecedor) {
        this.pecaFornecedor = pecaFornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
