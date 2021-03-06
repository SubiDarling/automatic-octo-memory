package com.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class CaptchaExample
 */
@WebServlet("/CaptchaExample")
public class CaptchaExample extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		
		// logic for generating the captcha image \\
		String str = "qwertyuiopasdfghjklzxcvbnm1234567890";
		String captcha = "";
		for(int i=0;i<5;i++) {
			int rno= (int)(Math.random() * str.length());
			captcha += str.charAt(rno);
		}
		HttpSession session = request.getSession();
				session.setAttribute("captcha1", captcha);
		
		//code for generating the image 
		BufferedImage img = new BufferedImage(100,75, BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.RED);
		g.fillRect(0,0,100,75);
		g.setColor(Color.YELLOW);
		g.setFont(new Font("harrington",Font.BOLD ,32));
		
		g.drawString(captcha, 10, 50);
		ImageIO.write(img , "jpeg" , out);
	
	}

	
}
