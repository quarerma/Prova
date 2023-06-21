/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

/**
 *
 * @author ice
 */
public class Carnaval extends Evento{

    public Carnaval(double valor, Data data, String Nome, int capacidade) {
        super(valor, data, Nome, capacidade);
    }
    
    @Override
    public boolean pessoaPodeParticipar(Pessoa pessoa) {

        
        return getData().diferenca(pessoa.getDataNascimento()) >= idadeEmDias && temVaga();  

    }
    
}
