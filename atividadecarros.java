/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura_repetição;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class atividadecarros {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int salario_f = 1000;
    int comis_1 = 500;
    int comis_2 = 1000;
    int salario = 0;
    int quant = 0;
    
    System.out.println("Informe se comissão que o vendedor deve receber se a 1 ou a 2  ");
    int codigo = entrada.nextInt();
    
    switch (codigo){
        
        case 1:
            System.out.println("Informe a quantdade de carros vendidos entre 1 e 5");
            quant = entrada.nextInt();
            salario = comis_1*quant;
            salario_f = salario_f + salario;
            System.out.println("Total de seu salaro: "+salario_f);
            break;
        case 2:
            System.out.println("Informe a quantdade de carros vendidos entre 5 e 10");
            quant = entrada.nextInt();
            salario = comis_2*quant;
            salario_f = salario_f + salario;
            System.out.println("Total de seu salaro: "+salario_f);
            break;
        default:
            System.out.println("Codigo nexistente");
           
            
        
    }
    
    
}
}