/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Usuario;
import java.util.List;
/**
 *
 * @author Myer
 */
public interface ManterUsuarioFacade {
    
    public boolean salvar(Usuario usuario);
    public List<Usuario> listarTodos();
}
