/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     * 
     */
    private static void Soma() {
        double n1, n2, r;
        Scanner ScOp = new Scanner(System.in);
            {
            System.out.println("Digite o primeiro Numero:");
            n1 = ScOp.nextDouble();
            System.out.println("Digite o Segundo Numero:");
            n2 = ScOp.nextDouble();
            r = n1 + n2;
            System.out.println("O resultado da Soma e: " + r );
            System.out.println("");
            }
        }
    private static void Subtracao() {
        double n1, n2, r;
        Scanner ScOp = new Scanner(System.in);
            {
            System.out.println("Digite o primeiro Numero:");
            n1 = ScOp.nextDouble();
            System.out.println("Digite o Segundo Numero:");
            n2 = ScOp.nextDouble();
            r = n1 - n2;
            System.out.println("O resultado da Subtracao e: " + r );
            System.out.println("");
            }
        }
    
     private static void Multiplicacao() {
        double n1, n2, r;
        Scanner ScOp = new Scanner(System.in);
            {
            System.out.println("Digite o primeiro Numero:");
            n1 = ScOp.nextDouble();
            System.out.println("Digite o Segundo Numero:");
            n2 = ScOp.nextDouble();
            r = n1 * n2;
            System.out.println("O resultado da multiplicacao e: " + r );
            System.out.println("");
            }
        }
     
      private static void Divisao() {
        double n1, n2, r;
        Scanner ScOp = new Scanner(System.in);
            {
            System.out.println("Digite o primeiro Numero:");
            n1 = ScOp.nextDouble();
            System.out.println("Digite o Segundo Numero:");
            n2 = ScOp.nextDouble();
            r = n1 / n2;
            System.out.println("O resultado da Divisao e: " + r );
            System.out.println("");
            }
        }
      
       private static void Exponenciacao() {
        double n1, r;
        Scanner ScOp = new Scanner(System.in);
            {
            System.out.println("Digite o Numero que deseja elevar ao Quadrado:");
            n1 = ScOp.nextDouble();
            r = Math.pow(n1,2);
            System.out.println(n1 + " Elevado ao Quadrado e " + r );
            System.out.println("");
            }
        }
    
    public static void main(String[] args) {
        int op = 8;
        Scanner sc = new Scanner(System.in);
       
        do{
            
            System.out.println("Selecione a Operacao Desejada: ");
            System.out.println("1 - Para Soma");
            System.out.println("2 - Para Subtrair");
            System.out.println("3 - Para Multiplicar");
            System.out.println("4 - Para Dividir");
            System.out.println("5 - Para Elevar ao Quadrado");
            System.out.println("0 - Para Encerrar");
            
            op = sc.nextInt();
            
            switch (op){
                case 1 : Soma();
                break;
                case 2: Subtracao();
                break;
                case 3: Multiplicacao();
                break;
                case 4: Divisao();
                break;
                case 5: Exponenciacao();
                break;
                case 0: System.out.println("Programa Encerrado!!!");
                break;
                default: System.out.println("Opcao invalida!");
                break;
            }
        } while(op != 0);
        
   }
}
