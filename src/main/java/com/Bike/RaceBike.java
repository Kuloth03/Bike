package com.Bike;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaceBike {

	@GetMapping(value="/get")
	public String Method()
	{
		return "hiiiiiiiiiiiiiiiiiiiiiiiiiiiiii";
	}
}
