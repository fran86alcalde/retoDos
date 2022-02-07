package com.everis.bootcamp.retodos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
			
			@Value("${some.value}")
			private String myvalue;
			
			@GetMapping(path="/myValue")
			private String myvalue() {
				return this.myvalue;	

}
}