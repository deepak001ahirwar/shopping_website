/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepak ahirwar
 */
public class PriceCalculator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            /* TODO output your page here. You may use following sample code. */
            
         int qut1=Integer.parseInt(request.getParameter("a1"));  
        int qut2=Integer.parseInt(request.getParameter("a2"));  
        int qut3=Integer.parseInt(request.getParameter("a3"));  
            
           int totalCost=(qut1*150+qut2*200+qut3*100);
            
            
            
          /*  out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PriceCalculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PriceCalculator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
                  */
           
   out.println("<center> the total cost of products selected is "+totalCost+"</center>");
        // out.println("result "+qut1);
    
    }
    }

  