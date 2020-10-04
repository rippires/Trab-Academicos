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
public class Secretaria extends Funcionario{

    public Secretaria(){
       salario = 1500.00; 
    }
    
    @Override
    public void exibeDados(){
      System.out.println("Cargo: Secretaria ");
      System.out.println("Nome: " + this.nome);
      System.out.println("Documento: " + this.documento);
      System.out.println("Salario:" + this.salario);
      
    }
    
}
