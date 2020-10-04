/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpoligonoretangulo;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Retangulo extends Poligono {
    double l1, l2 , area;

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int getQtdelados() {
        return qtdelados;
    }

    @Override
    public void setQtdelados(int qtdelados) {
        this.qtdelados = qtdelados;
    }

    
    
    @Override
     public double CalculaArea(){
         Scanner ret = new Scanner(System.in);{
         System.out.println("Digite o valor do primeiro lado do Retangulo: ");
         l1 = ret.nextDouble();
         System.out.println("Digite o valor do segundo lado do Retangulo: ");
         l2 = ret.nextDouble();
    }
         area = l1 * l2;
        return 0;
    }
    @Override
     public void imprimir(){
         this.qtdelados = 4;
         System.out.println("Retangulo ");
         System.out.println("Quantidade de lados: " + qtdelados);
         System.out.println("Comprimento: " + l1);
         System.out.println("Largura: " + l2);
         System.out.println("Area: " + area);
         
     }
}
