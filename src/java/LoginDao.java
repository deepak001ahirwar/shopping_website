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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepak ahirwar
 */
@WebServlet(urlPatterns = {"/LoginDao"})
public class LoginDao extends HttpServlet {

     public static boolean validate(String name ,String email,String pass){
                boolean status =false;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","system");
            PreparedStatement  ps=con.prepareStatement("select *from student5 where name=? and email=? and pass=?");
                    
                 ps.setString(1,name);
                   
                    
                  ps.setString(2,email);
                  ps.setString(3,pass);
                    
                    ResultSet rs=ps.executeQuery();
                    status=rs.next();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                return status ;
                
                }       
}

 
    

   
