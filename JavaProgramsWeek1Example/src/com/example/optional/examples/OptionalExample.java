package com.example.optional.examples;

import java.util.Optional;

public class OptionalExample {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		// int length = str.length(); // gives exception

		// Optional<String> string1= Optional.of(str); // gives exception
		// int length = str.length();

		Optional<String> string = Optional.ofNullable(str);
		if (!string.isEmpty())
			// if(string.isPresent())
			System.out.println(string.get().length());
		else
			System.out.println("String is null");

		try {
			Optional<?> optional = Optional.empty();

			// Optional<String> optional =Optional.ofNullable("hi");
			String str2 = (String) (optional.orElseThrow(() -> new Exception("Getting exception..")));
			System.out.println(str2);

			// optional.ifPresentOrElse((e)->{System.out.println("Hello "+e);},
			// ()->{System.out.println("NO VALUE!!");});

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
