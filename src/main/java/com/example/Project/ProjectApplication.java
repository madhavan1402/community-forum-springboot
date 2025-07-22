package com.example.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Project.ProjectApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		
		connect();
	}
    public static void connect() {
    	String url="jdbc:mysql://localhost:3306/Project";
    	String user ="root";
    	String password="root";
    	
    	try(Connection conn = DriverManager.getConnection(url, user, password)){
    		if(conn != null) {
    			System.out.print("Connection Successfully");
    		}
    	}
    	catch(SQLException e){
    		System.out.print("Unsuccessfully"+e.getMessage());
    	}
    }

}
