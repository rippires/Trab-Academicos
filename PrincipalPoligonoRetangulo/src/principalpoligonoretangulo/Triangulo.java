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
public class Triangulo extends Poligono{
    
    double Area, b, h;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double triangulo(){
        return 0;
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
        Scanner tri = new Scanner (System.in);{
    {
          System.out.println("Digite o valor da base do triangulo: ");
          b = tri.nextDouble();
          System.out.println("Digite a Altura do triangulo: ");
          h = tri.nextDouble();
    }      
        Area = (b * h) / 2;
        return 0;
}
}
    
         @Override
  public void imprimir(){
             this.qtdelados = 3;
             System.out.println(" Triangulo ");
             System.out.println(" Quantidade de lados: " + qtdelados);
             System.out.println(" Base: " + b);
             System.out.println(" Altura: " + h);
             System.out.println(" Area : " + Area);
}

   
}
    
    
    

