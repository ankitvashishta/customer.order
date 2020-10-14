package com.ankit.customer.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.customer.order.service.StringService;

@RestController
@RequestMapping("/string")
public class StringController {

	@Autowired
	private StringService stringService;

	/**
	 * Count the number of words in a string.
	 * 
	 * @param inputString
	 * @return
	 */
	@PostMapping("/count")
	public Integer countWords(@RequestBody String inputString) {
		if (inputString == null || inputString.trim().length() == 0)
			return 0;
		return stringService.getWords(inputString);
	}

}
