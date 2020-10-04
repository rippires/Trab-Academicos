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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presidente p = new Presidente();
        p.setNome ("Asdrubal Leôncio Correa");
        p.setDocumento("123.456.789.87");
        
        Secretaria s = new Secretaria();
        s.setNome("Fátima");
        s.setDocumento("789.456.123.02");
        
        Secretaria s2 = new Secretaria();
        s2.setNome("Ana");
        s2.setDocumento("4789.426.159.58");
        System.out.println("");
        
        Vendedor v = new Vendedor();
        v.setNome("João");
        v.setDocumento(".123.456.789.03");
        v.setComissao(1200.00);
        
        Vendedor v2 = new Vendedor();
        v2.setNome("Vanessa");
        v2.setDocumento("951.357.846.47");
        v2.setComissao(223.50);
        
        Vendedor v3 = new Vendedor();
        v3.setNome("Carlos");
        v3.setDocumento("963.852.741.01");
        v3.setComissao(800.00);
        
        Cliente c = new Cliente();
        c.setUsuario("Marcos");
       
        Cliente c2 = new Cliente();
        c2.setUsuario("Joana");
        
        Cliente c3 = new Cliente();
        c3.setUsuario("Elisa");
        
        Cliente c4 = new Cliente();
        c4.setUsuario("Lucas");
        c4.setSenha("123456");
        
        p.exibeDados();
        p.calculaSalarioAnual();
        System.out.println("");
        
        s.exibeDados();
        System.out.println("");
        
        s2.exibeDados();
        s2.calculaSalarioAnual();
        System.out.println("");
        
        v.exibeDados();
        System.out.println("");
        v2.exibeDados();
        System.out.println("");
        v3.exibeDados();
        System.out.println("");
        
        c.exibeDados();
        System.out.println("");
        c2.exibeDados();
        System.out.println("");
        c3.exibeDados();
        System.out.println("");
        c4.exibeDados();
        c4.mostrarsenha();
        
    }
}
