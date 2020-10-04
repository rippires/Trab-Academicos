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
public abstract class Poligono {
    int qtdelados;
   
    public int getQtdelados() {
        return qtdelados;
    }

    public void setQtdelados(int qtdelados) {
        this.qtdelados = qtdelados;
    }
    public abstract void imprimir();
    public abstract double CalculaArea();
}
