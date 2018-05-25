/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafeecodigo.gesfault.model;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author kelvin
 */
public class Usina {
    private UUID idUsina;
    private String descricaoUsina;
    private Endereco enderecoUsina;
    private Usuario gerente;
    private ArrayList<PecaEstoque> estoqueUsina;

    public UUID getIdUsina() {
        return idUsina;
    }

    public void setIdUsina(UUID idUsina) {
        this.idUsina = idUsina;
    }

    public String getDescricaoUsina() {
        return descricaoUsina;
    }

    public void setDescricaoUsina(String descricaoUsina) {
        this.descricaoUsina = descricaoUsina;
    }

    public Endereco getEnderecoUsina() {
        return enderecoUsina;
    }

    public void setEnderecoUsina(Endereco enderecoUsina) {
        this.enderecoUsina = enderecoUsina;
    }

    public Usuario getGerente() {
        return gerente;
    }

    public void setGerente(Usuario gerente) {
        this.gerente = gerente;
    }

    public ArrayList<PecaEstoque> getEstoqueUsina() {
        return estoqueUsina;
    }

    public void setEstoqueUsina(ArrayList<PecaEstoque> estoqueUsina) {
        this.estoqueUsina = estoqueUsina;
    }
}
