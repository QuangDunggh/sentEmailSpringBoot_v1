package com.bpoTECH.registeration;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailValidator implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO: Regex to validator email
		return false;
	}

}
