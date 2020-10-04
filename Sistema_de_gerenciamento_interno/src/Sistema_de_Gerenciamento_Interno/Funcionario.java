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
public abstract class Funcionario extends Pessoa {
    
    protected double salario, salarioAnual;
    protected int ramal;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    public Funcionario(){
       
    }
    
    @Override
    public void exibeDados(){
      
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    
    public double calculaSalarioAnual(){
      salarioAnual = (salario * 13);
        System.out.println("O Salario anual é: " + salarioAnual);
        return salarioAnual;
    }
    

    
    
    
    
    
    
    
}
