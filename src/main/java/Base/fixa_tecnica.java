/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import java.util.Scanner;

/**
 *
 * @author jean
 */
public class fixa_tecnica {
    Scanner entrada = new Scanner(System.in);
    
    private int febre = 5;
    private int cabeca = 1;
    private int espirro = 1;
    private int garganta = 1;
    private int tosse = 3;
    private int repiratoria = 10;
    private int corpo = 1;
    private int diarreia = 1;
    private int covid = 10;
    private int aglomeracao = 3;

    
    
    
    public int getFebre() {
        return febre;
    }

    public void setFebre(int febre) {
          if(this.febre  == 's' || this.febre == 'S') {
        this.febre = febre;
        } else {
            return;
        }
      
    }

    public int getCabeca() {
        return cabeca;
    }

    public void setCabeca(int cabeca) {
          if(this.cabeca  == 's' || this.cabeca == 'S') {
        this.cabeca = cabeca;
        } else {
            return;
        }
       
    }

    public int getEspirro() {
        return espirro;
    }

    public void setEspirro(int espirro) {
        this.espirro = espirro;
    }

    public int getGarganta() {
        return garganta;
    }

    public void setGarganta(int garganta) {
          if(this.garganta  == 's' || this.garganta == 'S') {
        this.garganta = garganta;
        } else {
            return;
        }
        this.garganta = garganta;
    }

    public int getTosse() {
        return tosse;
    }

    public void setTosse(int tosse) {
          if(this.tosse  == 's' || this.tosse == 'S') {
        this.tosse = tosse;
        } else {
            return;
        }
    
    }

    public int getRepiratoria() {
        return repiratoria;
    }

    public void setRepiratoria(int repiratoria) {
         if(this.repiratoria  == 's' || this.repiratoria == 'S') {
        this.repiratoria = repiratoria;
        } else {
            return;
        }
    }

    public int getCorpo() {
        return corpo;
    }

    public void setCorpo(int corpo) {
         if(this.corpo  == 's' || this.corpo == 'S') {
        this.corpo = corpo;
        } else {
            return;
        }
    }

    public int getDiarreia() {
        return diarreia;
    }

    public void setDiarreia(int diarreia) {
        if(this.diarreia == 's' || this.diarreia == 'S') {
        this.diarreia = diarreia;
        } else {
            return;
        }
    }

    public int getCovid() {
        return covid;
    }

    public void setCovid(int covid) {
          if(this.covid  == 's' || this.covid == 'S') {
        this.covid = covid;
        } else {
            return;
        }
      
    }

    public int getAglomeracao() {
        return aglomeracao;
    }

    public void setAglomeracao(int aglomeracao) {
          if(this.covid  == 's' || this.covid == 'S') {
        this.covid = covid;
        } else {
            return;
        }
    }

    public void construtor() {
        System.out.println("PREENCHA O FORMULARIO, 1 PRA SIM E 2 PRA NÃO");
        System.out.println("Tem Febre?(S/N)"); febre = entrada.nextInt();
        System.out.println("Tem dor de cabeça?(S/N)"); cabeca = entrada.nextInt();
        System.out.println("Tem secreção nasal ou espirros? (S/N)"); espirro  = entrada.nextInt();
        System.out.println("Tem dor/irritação na garganta? (S/N)"); garganta = entrada.nextInt();
        System.out.println("Tem tosse seca? (S/N)");tosse = entrada.nextInt();
        System.out.println("Tem dificuldade respiratória? (S/N)"); repiratoria = entrada.nextInt();
        System.out.println("Tem dores no corpo? (S/N)"); corpo = entrada.nextInt();
        System.out.println("Tem diarreia? (S/N)"); diarreia = entrada.nextInt(); 
        System.out.println("Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19? (S/N)"); covid = entrada.nextInt();
        System.out.println("Esteve em locais com grande aglomeração? (S/N)"); aglomeracao = entrada.nextInt();
    }
    
    void imprimir() {
        
    }
    
}
