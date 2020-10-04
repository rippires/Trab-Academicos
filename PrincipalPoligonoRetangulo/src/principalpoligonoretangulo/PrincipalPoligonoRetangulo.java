/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpoligonoretangulo;



/**
 *
 * @author ricar
 */
public class PrincipalPoligonoRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Triangulo tri = new Triangulo();
         tri.CalculaArea();
         tri.imprimir();
         System.out.println("");
         Retangulo ret = new Retangulo();
         ret.CalculaArea();
         ret.imprimir();
    }
}
