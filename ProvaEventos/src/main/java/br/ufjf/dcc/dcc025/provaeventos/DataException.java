/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

/**
 *
 * @author ice
 */
public class DataException extends Exception{
    public DataException(){
        super("ERRO: data inválida");
    }
}
