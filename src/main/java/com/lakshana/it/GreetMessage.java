package com.lakshana.it;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/new")
public class GreetMessage extends HttpServlet{
	public  void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String Greeting =null;
		Date date=new Date(0);
		int hour=date.getHours();
		if(hour>=6 && hour<=12) {
			Greeting="good morning";
			
		}
		else if(hour>=12 && hour<=16) {
			Greeting="good afternoon";
		}
		else if(hour>=16&&hour<=20){
			Greeting = "good evening";
		}
		else if(hour>=20&&hour<=6) {
			Greeting="good night";
		}
		PrintWriter pw = res.getWriter();
	    pw.append("<h1>"+Greeting+"</h1>");
	    pw.append("<h1>"+date+"</h1>");
	}

}
