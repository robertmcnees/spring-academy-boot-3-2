package academy.spring.sample.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/client")
public class ClientController {


//	private final RestClient restClient;
//
//	public ClientController(RestClient.Builder restClientBuilder) {
//		restClient = restClientBuilder.baseUrl("http://localhost:8080/api/person").build();
//	}

//	@GetMapping("/simpleGreeting")
//	public String simpleGreeting() {
//		return restClient.get().uri("/greeting").retrieve().body(String.class);
//	}

//	@GetMapping("/responseEntityGreeting")
//	public ResponseEntity<String> greetingWithHeaders() {
//		ResponseEntity<String> result = restClient.get().uri("/reGreeting").retrieve().toEntity(String.class);
//		System.out.println("Response status: " + result.getStatusCode());
//		System.out.println("Response headers: " + result.getHeaders());
//		System.out.println("Contents: " + result.getBody());
//		return result;
//	}

}
