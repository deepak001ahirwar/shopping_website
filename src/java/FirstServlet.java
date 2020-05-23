/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepak ahirwar
 */
public class FirstServlet extends HttpServlet {

      @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
            
               response.setContentType("text/html");
        try(PrintWriter out = response.getWriter()){
        
           
              
            String n=request.getParameter("name");
            String p=request.getParameter("email");
            String q=request.getParameter("pass");
            
            if(LoginDao.validate(n,p,q))
            {
                RequestDispatcher rd=request.getRequestDispatcher("servlet2");
                rd.forward(request,response);
            }
            else{
                out.print("sorry name or password error");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request,response);
            }
               }
               
            
            catch(Exception e)
    {
      System.out.println(e);
      
    }
    }
    }
    
    
