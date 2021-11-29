package Base;

import java.util.Scanner;

/**
 *
 * @author jean
 */
public class Formulario extends Indentificacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Indentificacao c = new Indentificacao();
        fixa_tecnica ft = new fixa_tecnica();

        System.out.println("Bem vindo(a), UPA");
        System.out.println("Deseja fazer Seu cadastro? Sim digite (1) / Não digite (2)");
        int cad = entrada.nextInt();
        System.out.println("------------------------------------------------------------");
        switch (cad) {
            case 1 -> {
                System.out.println("------------------------------------------------------------");
                c.construtor();
                ft.construtor();
               // c.imprimir();

            }
        }

    }

}
