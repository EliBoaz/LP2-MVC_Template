/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.ManterUsuario;

/**
 *
 * @author 31270425
 */
public class CadastrarUsuarioCommand implements Command {
    private ManterUsuario ManterUsuario;

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManterUsuario = new ManterUsuario();
            
    }
    
}
