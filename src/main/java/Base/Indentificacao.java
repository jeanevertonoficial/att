/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jean
 */
public class Indentificacao {

    Scanner entrada = new Scanner(System.in);
    //variaveis
    String cpf, nome, sexo;
    int idade;

    // Metodo construtor para preencher os dados do cliente
    void construtor() {
        System.out.println("\nPREENCHA O CADASTRO");
        System.out.println("-------------------------- Dados ----------------------------");
        System.out.println("Numero do CPF");
        cpf = entrada.nextLine();
        System.out.println("Informe seu nome completo");
        nome = entrada.nextLine();
        System.out.println("Informe o sexo M/F");
        sexo = entrada.nextLine();
        System.out.println("Informe sua idade");
        idade = entrada.nextInt();
        System.out.println("-----------------------------------------------------------");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // metodo de retorno de dados do cadastro do cliente
    public void imprimir() {
        System.out.println("------------------------------------------------------------");
        System.out.println("\nDADOS DO CADASTRO"
                + "\nCPF: " + cpf
                + "\nNome: " + nome
                + "\nsexo: " + sexo
                + "\nIdade: " + idade);

    }

}
