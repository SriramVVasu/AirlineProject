package com.employeetable;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class EmployeeTable
 */
public class EmployeeTable extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public EmployeeTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   try
	{
	PrintWriter pw=response.getWriter();
	response.setContentType("text/html");        
    

	 Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sriram");
     Statement st=con.createStatement();
     System.out.println("connection established successfully...!!");     
     ResultSet rs=st.executeQuery("Select * from emp");

     pw.println("<table border=3 color=red>");
     while(rs.next())
         {
     pw.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td>"+
                 "<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getInt(4)+"</td>"+"<td>"+
                   rs.getDate(5)+"</td>"+"<td>"+rs.getInt(6)+"</td>"
                   +"<td>"+rs.getInt(7)+"</td>"+"<td>"+rs.getInt(8)+"</td></tr>");
              }
          pw.println("</table>");
          pw.println("<a href='http://localhost:8080/EmployeeServProject/'> Go Back to Home </a>");
          pw.close();
          
     }
     catch (Exception e)
		{
         e.printStackTrace();
     }

	}
	}


