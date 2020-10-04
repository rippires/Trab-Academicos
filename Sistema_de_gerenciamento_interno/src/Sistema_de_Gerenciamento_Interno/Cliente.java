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
public class Cliente extends Pessoa{
    private String usuario;
    private String senha, s;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Cliente(){
        senha = ("");
        s = ("teste");
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public boolean verificarSenha(String s){
        if(senha.equals(s) ) {
		return true;
	} else {
	return false;
        }
   }
    
    public void mostrarsenha(){
        if(verificarSenha(s)){
            System.out.println("Senha correta!");
        } else{
            System.out.println("Senha incorreta!, a sua senha é: " + s );
        }
    }
    
    @Override
    public void exibeDados(){
      System.out.println("Cliente ");
      System.out.println("Nome: " + this.usuario);
    }
}
    
