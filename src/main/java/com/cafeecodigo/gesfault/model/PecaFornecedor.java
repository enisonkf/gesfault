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
public class PecaFornecedor {
    private UUID idPecaFornecedor;
    private Peca peca;
    private Fornecedor fornecedor;
    private double preco;

    public UUID getIdPecaFornecedor() {
        return idPecaFornecedor;
    }

    public void setIdPecaFornecedor(UUID idPecaFornecedor) {
        this.idPecaFornecedor = idPecaFornecedor;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
