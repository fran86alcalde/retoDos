package com.everis.bootcamp.retodos;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class RetodosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetodosApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
	}
	@PostMapping("/suma")
	 public String suma(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
		 return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
		 }
	@PostMapping("/resta")
	 public String resta(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
		 return "La resta de "+n1 +"+"+n2+" es "+(n1-n2);
		 }
	@PostMapping("/multiplicacion")
	 public String multiplicacion(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
		 return "El producto de "+n1 +"+"+n2+" es "+(n1*n2);
		 }
}
