package javaapplication4;

import java.util.ArrayList;

import java.util.Scanner;

public class JavaApplication4 {  
    
    static int menu() { 
        Scanner input = new Scanner(System.in);
        int opcao;
        
        System.out.print("##----------PetShop--------------##\n");//
        System.out.print("|---------------------------------|\n");//
        System.out.print("| Op 0 - Sair                     |\n");//
        System.out.print("|---------------------------------|\n");//
        System.out.print("| Op 1 - Novo Cliente + Animal    |\n");//
        System.out.print("| Op 2 - Novo Produto             |\n");//
        System.out.print("| Op 3 - Novo Servico             |\n");//
        System.out.print("| Op 4 - Novo Pedido              |\n");//
        System.out.print("| Op 5 - Novo Funcionario         |\n");//
        System.out.print("|---------------------------------|\n");//
        System.out.print("| Op 6 -  Visualizar Pedidos      |\n");//
        System.out.print("| Op 7 -  Visualizar Produtos     |\n");//
        System.out.print("| Op 8 -  Visualizar Clientes     |\n");//
        System.out.print("| Op 9 -  Visualizar Servicos     |\n");//
        System.out.print("| Op 10 - Visualizar Funcionarios |\n");//
        System.out.print("| Op 11 - Visualizar Animais      |\n");//
        System.out.print("|---------------------------------|\n");//
        System.out.print("| Op 12 - Excluir Pedido          |\n");//
        System.out.print("| Op 13 - Excluir Produto         |\n");//    
        System.out.print("| Op 14 - Excluir Cliente         |\n");//
        System.out.print("| Op 15 - Excluir Servico         |\n");//
        System.out.print("| Op 16 - Excluir Funcionario     |\n");//
        System.out.print("|---------------------------------|\n");//
        System.out.print("Digite: ");
        opcao = input.nextInt();   
        
        return opcao;
    }
    
    public static void main(String[] args) {
        int opcao;
        boolean sistemaRodando = true;
        Scanner input = new Scanner(System.in);
        
        ArrayList<Funcionario> ListaFuncionarios = new ArrayList();
        Funcionario funcionario = new Funcionario(1500.50f, "juninho", "3232-2323", "rua tal", "47 994343");
        ListaFuncionarios.add(funcionario);
        
        ArrayList<Cliente> ListaClientes = new ArrayList();
        Cliente cliente = new Cliente("11/03/2002", "eduardo", "134.433.333-19", "rua bahia 38 itajai", "47 9999999");
        cliente.setAnimal("Pitbull", "preto", "Jade", 5, 3.5f, "f", "nao");
        ListaClientes.add(cliente);    
        
        ArrayList<Produto> ListaProdutos = new ArrayList();
        Produto produto = new Produto(32322, "agua", 55.6f);
        ListaProdutos.add(produto);
        
        ArrayList<Servico> ListaServicos = new ArrayList();
        Servico servico = new Servico(212, "Servico aqui");
        ListaServicos.add(servico);
        
        ArrayList<Pedido> ListaPedidos = new ArrayList();
        Pedido pedido = new Pedido("dd", 54.1f, "3232", cliente, servico);
        ListaPedidos.add(pedido);
                
        while (sistemaRodando) {
            opcao = menu();
            if (opcao == 0){
                sistemaRodando = false;
            }
            else if (opcao == 1) {
                String dataCriacao;
                String nome;
                String cpf;
                String endereco;
                String telefone;
                      
                System.out.print("Insira a data de criacao do Cliente: ");
                dataCriacao = input.next();
                
                System.out.print("Insira o nome do Cliente: ");
                nome = input.next();
                
                System.out.print("Insira o CPF do Cliente: ");
                cpf = input.next();
                
                System.out.print("Insira o endereco do Cliente: ");
                endereco = input.next();
                
                System.out.print("Insira o telefone do Cliente: ");
                telefone = input.next();
                
                String racaOpAnimal;
                String corOpAnimal;
                String nomeOpAnimal;
                int idadeOpAnimal;
                float pesoOpAnimal;
                String sexoOpAnimal;
                String OBSanimal;
                    
                System.out.print("Raca do animal: ");
                racaOpAnimal = input.next();
                
                System.out.print("cor do animal: ");
                corOpAnimal = input.next();
                
                System.out.print("nome do animal: ");
                nomeOpAnimal = input.next();

                System.out.print("idade do animal: ");
                idadeOpAnimal = input.nextInt();

                System.out.print("peso do animal: ");
                pesoOpAnimal = input.nextFloat();

                System.out.print("Sexo do Animal: ");
                sexoOpAnimal = input.next();
                
                System.out.print("Alguma Observacao?: ");
                OBSanimal = input.next();                
                
                Cliente clientOp = new Cliente(dataCriacao, nome, cpf, endereco, telefone);
                clientOp.setAnimal(racaOpAnimal, corOpAnimal, nomeOpAnimal, idadeOpAnimal, pesoOpAnimal, sexoOpAnimal, OBSanimal);
                ListaClientes.add(clientOp);
            }
            else if (opcao == 2) {
                String nome;
                int codProduto;
                float preco;
                
                System.out.print("Insira o nome do Produto: ");
                nome = input.next();
                
                System.out.print("Insira o codigo do Produto: ");
                codProduto = input.nextInt();
                
                System.out.print("Insira o preco do Produto: ");
                preco = input.nextFloat();
    
                Produto produtoOp = new Produto(codProduto, nome, preco);
                ListaProdutos.add(produtoOp);     
            }
            else if (opcao == 3) {
                int codServico;
                String nomeSer;
                
                System.out.print("Insira o codigo do Servico: ");
                codServico = input.nextInt();
                
                System.out.print("Insira o codigo do Servico: ");
                nomeSer = input.next();
                
                Servico servicoOp = new Servico(codServico, nomeSer);
                ListaServicos.add(servicoOp);
            }
            else if (opcao == 4) {
                String descricaoPedidoOp;
                float valorTotOp;
                String dataPedidoOp;
                
                System.out.println("Descricao do produto: ");
                descricaoPedidoOp = input.next();
                
                System.out.println("Valor do produto: ");
                valorTotOp = input.nextFloat();
                
                System.out.println("Data do produto: ");
                dataPedidoOp = input.next();
                
                Pedido pedCliente = new Pedido(descricaoPedidoOp, valorTotOp, dataPedidoOp, cliente, servico);
            }
            else if (opcao == 5) {
                float salarioFunc;
                String nomeFunc;
                String cpfFunc;
                String enderecoFunc;
                String telefoneFunc;
                
                System.out.print("Insira o nome do funcionario: ");
                nomeFunc = input.next();
                
                System.out.print("Insira o salario do funcionario: ");
                salarioFunc = input.nextFloat();

                System.out.print("Insira o cpf do funcionario: ");
                cpfFunc = input.next();
                
                System.out.print("Insira o endereco do funcionario: ");
                enderecoFunc = input.next();
                
                System.out.print("Insira o telefone do funcionario: ");
                telefoneFunc = input.next();         
                
                Funcionario newfuncionario = new Funcionario(salarioFunc, nomeFunc, cpfFunc, enderecoFunc, telefoneFunc);   
                ListaFuncionarios.add(newfuncionario);     
            }
            else if (opcao == 6) {
                int j = 0;
                for (Pedido i: ListaPedidos){
                    System.out.println(j + "-" + i.getDataPedido()+ " " + i.getDescricaoPedido()+ " " + i.getValorTot());
                    j++;
                }   
            }
            else if (opcao == 7) {
                int j = 0;
                for (Produto i: ListaProdutos){
                    System.out.println(j + "-" + i.getCodProduto() + " " + i.getNome() + " " + i.getPreco());
                    j++;
                }     
            }
            else if (opcao == 8) {
                for (Cliente i: ListaClientes){
                    System.out.println(i.getDataCriacao()+ " " + i.getNome() + " " + i.getCpf() + " " + i.getEndereco() + " " + i.getTelefone());
                }   
            }
            else if (opcao == 9) {
                for (Servico i: ListaServicos){
                    System.out.println(i.getCodServico() + " " + i.getNome());
                } 
            }
            else if (opcao == 10) {
                int j = 0;
                for (Funcionario i: ListaFuncionarios){
                    System.out.println(j + " - "+ i.getNome() + " - " + i.getCpf() + " - " + i.getSalario());
                    j++;
                }
            }
            else if (opcao == 11) {
                for (Cliente i: ListaClientes) {
                    i.imprimirAnimal(i);
                }
            }
            else if (opcao == 12) {
                int indiceRemoverProduto;
                int j = 0;
                for (Pedido i: ListaPedidos){
                    System.out.println(j + "-" + i.getDescricaoPedido()+ " " + i.getDataPedido()+ " " + i.getValorTot());
                    j++;
                }
                System.out.println("Escolha o indice para ser remover o pedido: ");
                indiceRemoverProduto = input.nextInt();
                ListaPedidos.remove(indiceRemoverProduto);            
            }
            else if (opcao == 13) {
                int indiceRemoverProduto;
                int j = 0;
                for (Produto i: ListaProdutos){
                    System.out.println(j + "-" + i.getCodProduto() + " " + i.getNome() + " " + i.getPreco());
                    j++;
                }
                System.out.println("Escolha o indice para ser remover o produto: ");
                indiceRemoverProduto = input.nextInt();
                ListaProdutos.remove(indiceRemoverProduto);
            }
            else if (opcao == 14) {
                int indiceRemoverCliente;
                int j = 0;
                for (Cliente i: ListaClientes){
                    System.out.println(i.getDataCriacao()+ " " + i.getNome() + " " + i.getCpf() + " " + i.getEndereco() + " " + i.getTelefone());
                    j++;
                } 
                System.out.println("Escolha o indice para ser remover o cliente: ");
                indiceRemoverCliente = input.nextInt();
                for (Cliente i: ListaClientes) {
                    i.excluirAnimal(indiceRemoverCliente);
                }
                ListaClientes.remove(indiceRemoverCliente);
            }
            else if (opcao == 15) {
                int indiceRemoverServico;
                int j = 0;
                for (Servico i: ListaServicos){
                    System.out.println(j + "-" + i.getCodServico() + " " + i.getNome());
                    j++;
                }
                System.out.println("Escolha o indice para ser remover o servico: ");
                indiceRemoverServico = input.nextInt();
                ListaServicos.remove(indiceRemoverServico);
            }
            else if (opcao == 16) {
                int indiceRemoverFuncionario;
                int j = 0;
                for (Funcionario i: ListaFuncionarios){
                    System.out.println(j + " - "+ i.getNome());
                    j++;
                }
                System.out.println("Escolha o indice para ser remover o Funcionario: ");
                indiceRemoverFuncionario = input.nextInt();
                ListaServicos.remove(indiceRemoverFuncionario);
            
            }
        }
    }
}
