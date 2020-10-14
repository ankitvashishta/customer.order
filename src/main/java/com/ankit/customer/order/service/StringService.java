package com.ankit.customer.order.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class StringService {

	public Integer getWords(String inputString) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String[] wordArray = inputString.split(" ");
		for (String word : wordArray) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
			} else {
				wordMap.put(word, 1);
			}

		}
		return wordMap.values().stream().mapToInt(Integer::intValue).sum();
	}

}
