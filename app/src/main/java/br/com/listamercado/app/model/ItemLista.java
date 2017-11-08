package br.com.listamercado.app.model;

import com.orm.SugarRecord;

/**
 * Created by kassianoresende on 23/10/17.
 */

public class ItemLista extends SugarRecord {

    private String nome;
    private boolean comprado;


    public ItemLista(){}

    public ItemLista(String nome, boolean comprado){
        this.nome = nome;
        this.comprado = comprado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}
