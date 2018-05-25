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
public class Peca {
    private UUID idPeca;
    private String descricaoPeca;
    private String imagem;

    public UUID getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(UUID idPeca) {
        this.idPeca = idPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
