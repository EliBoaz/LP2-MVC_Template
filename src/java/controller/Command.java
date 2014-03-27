/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Myer
 */
public interface Command {
    
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
    
}
