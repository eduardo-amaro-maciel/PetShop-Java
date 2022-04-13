/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Pedido {
    private String descricaoPedido;
    private float valorTot;
    private String dataPedido;
    
    private Cliente clienteProduto;
    private Servico servicoProduto;
    
    public Pedido(String descricaoPedido, float valorTot, String dataPedido, Cliente clienteProduto, Servico servicoProduto) {
        this.descricaoPedido = descricaoPedido;
        this.valorTot = valorTot;
        this.dataPedido = dataPedido;
        this.clienteProduto = clienteProduto;
        this.servicoProduto = servicoProduto;
    }

    public Servico getServicoProduto() {
        return servicoProduto;
    }

    public void setServicoProduto(Servico servicoProduto) {
        this.servicoProduto = servicoProduto;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public float getValorTot() {
        return valorTot;
    }

    public void setValorTot(float valorTot) {
        this.valorTot = valorTot;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getClienteProduto() {
        return clienteProduto;
    }

    public void setClienteProduto(Cliente clienteProduto) {
        this.clienteProduto = clienteProduto;
    }
}
