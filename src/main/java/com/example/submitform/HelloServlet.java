package com.example.submitform;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
res.setContentType("text/HTML");
 PrintWriter out= res.getWriter();
 out.println("<h2>welcome here</h2>");
 String gname= req.getParameter("user_name");
 String password=req.getParameter("user_password");
 String email=req.getParameter("user_email");
 String gender=req.getParameter("user_gender");
 String course=req.getParameter("user_course");

String condition = req.getParameter("condition");
out.println(condition);
if(condition!=null){
if(condition.equals("checked")){
 out.println("<h2>name:"+gname+"</h2>");
 out.println("<h2>password:"+password+"</h2>");
 out.println("<h2> gender:"+gender+"</h2>");
 out.println("<h2> email:"+email+"</h2>");
 out.println("<h2> course:"+course+"</h2>");

//RequestDispatcher rd=req.getRequestDispatcher("sucess");
//rd.forward(req,res);
}
else{
 out.println("<h2> you have not accepted</h2>");
}}
else{
 out.println("<h1>you have not accepted the terms and conditions</h1>");
 //i want to include the  output of index.html
 //get the object of  requestdispatcher
 RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
 //include
 rd.include(req,res);

}



}




}