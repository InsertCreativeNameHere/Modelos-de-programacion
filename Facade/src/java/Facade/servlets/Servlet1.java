/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Facade.logica.comprarCelular;

/**
 *
 * @author Usuario
 */
public class Servlet1 extends HttpServlet {
  public String marca;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          
            throws ServletException, IOException {
          
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         marca=request.getParameter("usuario");
         comprarCelular celular=new comprarCelular();
        
        switch (marca) {  
            case "IPhone":  
                {   
                 marca=celular.iphoneSale();  
                    }  
                break;  
       case "Samsung":  
                {  
                 marca=celular.samsungSale();        
                    }  
                break;    
       case "Huawei":  
                           {  
                 marca=celular.huaweiSale();       
                           }  
                   break;     
            default:  
            {    
                marca="(Modelo no disponible)";  
            }
        }
      
        try (PrintWriter out = response.getWriter()) {  
       out.println("<h1>El modelo disponible es: " + marca + "</h1>");           
    }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
