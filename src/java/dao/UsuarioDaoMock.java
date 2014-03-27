/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Usuario;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Myer
 */
import java.util.List;
/**
 *
 * @author Myer
 */
public class UsuarioDaoMock implements UsuarioDao{
    
    private static HashMap<String,Usuario> usuarios=new HashMap<String, Usuario>();
    {
        usuarios.put("1", new Usuario("1","Anderson","anderson", "a") );
        
        usuarios.put("2", new Usuario("2","Fabio","fabio", "f") );
        
        usuarios.put("3", new Usuario("3","Carlos","carlos", "c") );
    }

    @Override
    public boolean atualizar(Usuario usuario) {
        return salvar(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        ArrayList<Usuario> todosUsuarios=new ArrayList<Usuario>();
        for(Usuario usuario:usuarios.values()){
            todosUsuarios.add(usuario);
        }
        return todosUsuarios;
    }

    @Override
    public Usuario obterPorId(String id) {
        return usuarios.get(id);
    }

    @Override
    public boolean remover(Usuario usuario) {
        usuarios.remove(usuario.getId());
        return true;
    }

    @Override
    public boolean salvar(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
        return true;
    }
    
    
}
