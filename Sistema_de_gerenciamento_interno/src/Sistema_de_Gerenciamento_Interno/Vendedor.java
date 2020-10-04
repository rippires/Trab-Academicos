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
public class Vendedor extends Funcionario {
    
    private double comissao, salariocomissao;

    public double getSalariocomissao() {
        return salariocomissao;
    }

    public void setSalariocomissao(double salariocomissao) {
        this.salariocomissao = salariocomissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public Vendedor(){
      salario = 3500.00;
    } 
    
    public double salarioMesComComissao(){
        salariocomissao = comissao + salario;
        return salariocomissao;
    }
    @Override
    public void exibeDados(){
      System.out.println("Cargo: Vendedor(a) ");
      System.out.println("Nome: " + this.nome);
      System.out.println("Documento: " + this.documento);
      System.out.println("Salario:" + this.salario);
      System.out.println("Salario com comissao é: " + salarioMesComComissao());
    }

}
