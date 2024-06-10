package com.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import  com.sp.resources.SpringConfigFile;
public class App 
{
    public static void main( String[] args )
    
    
    {
    int std_rollno = 101;
    String std_name = "Ananyah";
    float std_marks = 93.2f;
    	
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
         JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
         
         //----------------------------INSERT OPERATION--------------------------------
         
         String insert_sql_query="INSERT INTO student VALUES(?,?,?)";
          int count =jdbcTemplate.update(insert_sql_query, std_rollno, std_name ,std_marks);
         if(count> 0)
         {
        	 System.out.println("insertion success");
         }
         else
         {
        	 System.out.println("insertion failed");
         }
         
         
         
}
}
