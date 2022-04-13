/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.ArrayList;



/**
 *
 * @author eduar
 */
public class Cliente extends Pessoa {
   
    private String dataCriacao;
    private ArrayList<Animal> ListaAnimais = new ArrayList();

    public Cliente(String dataCriacao, String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);        
        this.dataCriacao = dataCriacao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public void setAnimal(String raca, String cor, String nome, int idade, float peso, String sexo, String observacao) {
        Animal ani = new Animal(raca, cor, nome, idade, peso, sexo, observacao);
        this.ListaAnimais.add(ani);
    }
    
    public void excluirAnimal(int pos) {     
        int index = 0;
        for (Animal i: this.ListaAnimais) {
            if (index == pos) {
                this.ListaAnimais.remove(pos);
            }
            index++;
        }
    }
    
    public void imprimirAnimal(Cliente cliente) {
       for (Animal i: this.ListaAnimais) {
           System.out.println("Dono: " + cliente.getNome() + " | nome animal: " + i.getNome() + " | raca animal: " + i.getRaca());
       }
    } 
    
}
