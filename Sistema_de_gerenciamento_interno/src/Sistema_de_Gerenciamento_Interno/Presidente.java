/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 *
 * @author ricar
 */
public class Presidente extends Funcionario {

    public Presidente(){
      salario = 10000.00;
    }
    @Override
      public void exibeDados(){
      System.out.println("Cargo: Presidente ");  
      System.out.println("Nome: " + this.nome);
      System.out.println("Documento: " + this.documento);
      System.out.println("Salario:" + this.salario);
}
    
}
