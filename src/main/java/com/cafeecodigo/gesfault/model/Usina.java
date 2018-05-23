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
}
