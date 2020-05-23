/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepak ahirwar
 */
public class NewServlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
         String name=request.getParameter("name");
         String email=request.getParameter("email");
         String pass=request.getParameter("pass");
         String mob=request.getParameter("mob");
         
         
         try{
             Class.forName("com.mysql.jdbc.Driver");
             //creating connection with the database
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","system");
             PreparedStatement ps=con.prepareStatement("insert into student5 values(?,?,?,?) ");
             
             ps.setString(1, name);
             ps.setString(2, email);
             ps.setString(3, pass);
             ps.setString(4, mob);
             
             int i=ps.executeUpdate();
             if(i>0)
             {
                 out.println("you are sucessfully registered");
                 RequestDispatcher rd=request.getRequestDispatcher("index.html");
                 rd.include(request,response);
                 
                 
             }
            
             
            
         }
        catch(Exception se)
        {
            se.printStackTrace();
        }
            
        }
    }
