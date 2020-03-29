/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ariane
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Lista de Empresas Cadastradas</h3>");
        out.println("<ul>");
        
        for (Empresa empresa : lista) {
            out.println("<li>" + empresa.getNome() + "</li>");
        }
       
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }

}
