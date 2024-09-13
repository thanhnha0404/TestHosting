/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.infor;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import murach.business.User;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author MyPC
 */
public class InforListServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String url = "/index.html";
        
        String action = request.getParameter("action");
        if(action == null){
            action = "join";        
        }
        if(action.equals("join")){
            url = "/index.html";
        }
        else if(action.equals("add"))
        {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String birth = request.getParameter("birthday");
            String way = request.getParameter("way");
            String[] announcements = request.getParameterValues("announcements");
            String contact = request.getParameter("contact");
            
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // Định dạng đầu ra thành "dd/MM/yyyy"
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Chuyển đổi chuỗi thành đối tượng LocalDate
            LocalDate date = LocalDate.parse(birth, inputFormatter);
            // Chuyển đổi đối tượng LocalDate thành chuỗi với định dạng mong muốn
            String birthday = date.format(outputFormatter);
            
            
            if (announcements == null || announcements.length == 0) {
                announcements = new String[]{" ", " "};  
            } else if (announcements.length == 1) {
                announcements = new String[]{announcements[0], " "};  
            }
            
            
            User user = new User(email,firstName,lastName,birthday,way,announcements,contact);
            
            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }
        
        getServletContext()
                  .getRequestDispatcher(url)
                  .forward(request, response);
    }
            
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response); 
    }
}
