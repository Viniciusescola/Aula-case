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
public class Atividadecase2 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int total = 0;
    System.out.println("Informe um numero entre 3 e 5");
    int codigo = entrada.nextInt();
    
    switch (codigo){
        
        case 3:
            System.out.println("Informe um dois valores");
            int num = entrada.nextInt();int num2 = entrada.nextInt();
            total = num + num2;
            total = total + (total*20)/100;
            System.out.println("Total: "+total);
            break;
        case 4:
            System.out.println("Informe um dois valores");
            num = entrada.nextInt();num2 = entrada.nextInt();
            total = num - num2;
            total = total + (total*20)/100;
            System.out.println("Total: "+total);
            break;
        case 5:
            System.out.println("Informe um dois valores");
            num = entrada.nextInt();num2 = entrada.nextInt();
            total= num + num2;
            total = total - (total*5)/100;
            System.out.println("Total: "+total);
            break;
        default:
            System.out.println("Código inexistente");
    }
    
}
}