/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author eduar
 */
public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(float salario, String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
