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
public class Pessoa {
    private Data dataNascimento;
    public String nome;
    private List<Evento> eventos;

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    
    public Pessoa(Data dataNascimento, String nome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        eventos = new ArrayList<>();
    }
    
    public boolean podeParticiparEvento(Evento e){
        for(Evento evento : eventos)
        {
            if(evento.getData().diferenca(e.getData()) == 0)
                return false;
        }
        return true;
    }
    
    public void agendarEvento(Evento e){
        if(podeParticiparEvento(e))
            eventos.add(e);
    }

   
}
