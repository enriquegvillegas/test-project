package spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test")
	public String test() {
		return "hello riki boy aga ruth and nicole direct from eclipse ito hehehe";
	}
}
