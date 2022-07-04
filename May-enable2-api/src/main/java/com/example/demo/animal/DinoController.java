package com.example.demo.animal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinoController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "<html>\r\n"
				+ " <head>\r\n"
				+ "<title> Postman Pat </title>"
				+ "     <style>\r\n"
				+ "         h1{ color: orange;\r\n"
				+ "    background-color: bisque;\r\n"
				+ "    font-size: 50px;\r\n"
				+ "    text-decoration: underline;\r\n"
				+ "    font-family: Arial;\r\n"
				+ "    text-align: center;\r\n}"
				+ "    form { color: blue;r\n"
				+ "		text-allign: center;\r\n}"
				+ "     </style>\r\n"
				+ " </head>\r\n"
				+ " <body>\r\n"
				+ " <h1>DINO POST FOR THE COOLEST DINOS</h1>"
				+ "         <form> <label for=\"username\">Enter Specie Name:</label>\r\n"
				+ "        <input type=\"text\" name=\"username\" id=\"username\" placeholder= \"username\" required>\r\n"
				+ "        <br> <br>\r\n"
				+ "        <label for=\"email\"> Enter Email:</label>\r\n"
				+ "        <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"your email\" required>\r\n"
				+ "        <br> <br>\r\n"
				+ "        <label for=\"password\">Secret ROAR:</label>\r\n"
				+ "        <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"choose a password\" required>\r\n"
				+ "\r\n"
				+ "        <p>Select your Age:</p>\r\n"
				+ "        \r\n"
				+ "        <input type=\"radio\" name=\"age\" value=\"0-25BC\" id=\"option-1\">\r\n"
				+ "        <label for=\"option-1\">0-25</label> \r\n"
				+ "        <input type=\"radio\" name=\"age\" value=\"26-50BC\" id=\"option-2\">\r\n"
				+ "        <label for=\"option-2\">26-32</label>\r\n"
				+ "        <input type=\"radio\" name=\"age\" value=\"51+BC\" id=\"option-3\">\r\n"
				+ "        <label for=\"option-3\">33-45</label>\r\n"
				+ "        <br> <br>\r\n"
				+ "        <label for=\"question\">Security Question:</label>\r\n"
				+ "        <select name=\"question\" id=\"question\">\r\n"
				+ "            <option value=\"q1\">what habitat were you born in?</option>\r\n"
				+ "            <option value=\"q2\">what is your favourite meal?</option>\r\n"
				+ "            <option value=\"q3\">what was your first meteorite attack called?</option>\r\n"
				+ "        </select>\r\n"
				+ "        <br> <br>\r\n"
				+ "        \r\n"
				+ "        <label for=answer\">Security Question answer:</label>\r\n"
				+ "        <input type=\"text\" id=\"answer\" name=\"answer\" required>\r\n"
				+ "\r\n"
				+ "        <br><br>\r\n"
				+ "        \r\n"
				+ "        <label for=\"bio\">Tell me about yourself:</label> \r\n"
				+ "        <br>\r\n"
				+ "        <textarea name=\"bio\" id=\"bio\" cols=\"30\" rows=\"10\" placeholder=\"Enter your bio here :P\"></textarea>\r\n"
				+ "        <br><br>\r\n"
				+ "\r\n"
				+ "        <input type=\"submit\" value=\"sumbit the form\"></form>\r\n"
		
		
				+ " </body>\r\n"
				+ " </html>";
		
	}
}
