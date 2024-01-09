package academy.spring.sample.server.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@GetMapping("/greeting")
	public String genericGreeting() {
		return "Hello there!";
	}

	@GetMapping("/{name}/greeting")
	public String personalizedGreeting(@PathVariable String name) {
		return "Good to see you, " + name + "!";
	}

	@GetMapping("/reGreeting")
	public ResponseEntity<String> responseEntitySimpleGreeting() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Spring-Is-Cool", "true");

		return new ResponseEntity<>("Hello with headers!", headers, HttpStatus.OK);
	}


}
