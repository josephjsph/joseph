package com.example.applicationjoseph;

import android.database.sqlite.SQLiteDatabaseLockedException;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by josep on 04/06/2017.
 */




public class Livro extends RealmObject
{
    @PrimaryKey
    private  int id;
    private String nome;
    private String autor;
    private int ano;

    public Livro(){}
    public Livro(int id, String autor, String nome, int ano)
    {
        this.id = id;
        this.autor = autor;
        this.nome = nome;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }


}
