/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

import javax.swing.text.html.parser.Parser;

/**
 *
 * @author ice
 */
public class Data {
    private  int dia;
    private  int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
 

    public static Data parser(String data) throws DataException{
        String[] datas = data.split("/");
        
        if(datas.length != 3) throw new DataException();
        
        checaDia(datas[0]);
        checaMes(datas[1]);
        checaAno(datas[2]);
        
        Data result = new Data();

        result.dia = parserToInt(datas[0]);
        result.mes = parserToInt(datas[1]);
        result.ano = parserToInt(datas[2]);

        
        return result;
    }

    public int diferenca(Data data){
        int _this_dias;
        int _data_dias;
        
        _this_dias = (this.ano * 12 + this.mes) * 30 + this.dia;
        _data_dias = (data.ano * 12 + data.mes) * 30 + data.dia;
        
        return _this_dias - _data_dias;
    } 
    
    public static int parserToInt(String str) throws DataException{
        try {
            return Integer.parseInt(str);
            }
        catch(NumberFormatException e){
            throw new DataException();
        }
    }
    
    
    public static void checaDia(String dia) throws DataException{
        if(dia.length() > 2)
            throw new DataException();
        
        int diaInt = Integer.parseInt(dia);
        
        if(diaInt > 30 || diaInt <= 0)
            throw new DataException();
    }
    public static void checaMes(String mes) throws DataException{
        if(mes.length() > 2)
            throw new DataException();
        
        int mesInt = Integer.parseInt(mes);
        
        if(mesInt > 12 || mesInt <= 0)
            throw new DataException();
    }
    public static void checaAno(String ano) throws DataException{
         if(ano.length() > 4)
             throw new DataException();
     }
}
