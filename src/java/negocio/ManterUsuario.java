/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Myer
 */
public class ManterUsuario implements ManterUsuarioFacade{
    private static HashMap<String,Usuario> usuariosBancoDeDados=new HashMap<String, Usuario>();
    {
        usuariosBancoDeDados.put("1", new Usuario("1","Anderson","anderson", "a") );
        
        usuariosBancoDeDados.put("2", new Usuario("2","Fabio","fabio", "f") );
        
        usuariosBancoDeDados.put("2", new Usuario("3","Carlos","carlos", "c") );
    }
    
    public boolean salvar(Usuario usuario) {
        if(usuario.getNome()==null || usuario.getNome().equals("")){
            return false;
        }
        if(usuario.getLogin()==null || usuario.getLogin().equals("")){
            return false;
        }
        usuariosBancoDeDados.put(usuario.getId(), usuario);
        return true;
    }
    
    public List<Usuario> listarTodos() {
        ArrayList<Usuario> todosUsuarios=new ArrayList<Usuario>();
        for(Usuario usuario:usuariosBancoDeDados.values()){
            todosUsuarios.add(usuario);
        }
        return todosUsuarios;
    }
    
}
