/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public abstract class Evento {
    private double valor;
    private Data data;
    private String Nome;
    private int capacidade;
    private List<Pessoa> participantes;

    public double getValor() {
        return valor;
    }

    public Data getData() {
        return data;
    }

    public String getNome() {
        return Nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public Evento(double valor, Data data, String Nome, int capacidade) {
        this.valor = valor;
        this.data = data;
        this.Nome = Nome;
        this.capacidade = capacidade;
        participantes = new ArrayList<>();
    }
    
    
    public boolean temVaga(){
        if(this.capacidade - this.participantes.size() > 0)
            return true;
        return false;
    }
    
    public abstract boolean pessoaPodeParticipar(Pessoa pessoa);
    
    public void adicionaPessoa(Pessoa pessoa){
        if(pessoaPodeParticipar(pessoa))
            participantes.add(pessoa);
    }
}
