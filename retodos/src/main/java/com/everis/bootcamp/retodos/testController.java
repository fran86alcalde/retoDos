package com.everis.bootcamp.retodos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class testController {
			
			/*@Value("${some.value}")
			private String myvalue;
			
			@GetMapping(path="/myValue")
			private String myvalue() {
				return this.myvalue;}*/

			@GetMapping("/suma")
			public String suma(@RequestParam("valorn1") String n1,@RequestParam("valorn2") String n2){
					 return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
					 }
			@GetMapping("/resta")
			public String resta(@RequestParam("valorn1") int n1,@RequestParam("valorn2") int n2){
					 return "La resta de "+n1 +"+"+n2+" es "+(n1-n2);
					 }
			@GetMapping("/multiplicacion")
			public String multiplicacion(@RequestParam("valorn1") int n1,@RequestParam("valorn2") int n2){
					 return "El producto de "+n1 +"+"+n2+" es "+(n1*n2);
					 
}
}