package com.example.function.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredinedFIApp {

	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> (i > 0) && (i < 10);
		System.out.println(p.test(9));
		// ---------------------------------------------------------------------
		Function<String, Integer> fun = (str) -> str.length();
		System.out.println("length is " + fun.apply("India"));

		Function<Person, String> fun2 = (person) -> person.getName() + " lives in " + person.getCity();
		System.out.println(fun2.apply(new Person(101, "John", "Banglore")));

		Function<Person, String> fun3 = (person) -> {
			if (person.getId() == 101) {
				return person.getName() + " lives in " + person.getCity();
			} else {
				return "Incorrect Person";
			}

		};
		System.out.println(fun3.apply(new Person(104, "John", "Banglore")));
		// ---------------------------------------------------------------------

		Consumer<Person> c1 = (person) -> System.out.println(person);
		c1.accept(new Person(102, "Mira", "Delhi"));

		Consumer<Person> c2 = (person) -> {
			if (person.getId() == 101) {
				person.setName("ADMIN");
			}
			System.out.println(person);
		};

		c2.accept(new Person(101, "Mira", "Delhi"));
		// ---------------------------------------------------------------------
		Supplier<String> otps = () -> {
			String otp = "";

			otp = otp + new Random().nextInt();

			return otp;
		};
		System.out.println("1st call " + otps.get());
		System.out.println("2nd call " + otps.get());
		System.out.println("3rd call " + otps.get());
		// ---------------------------------------------------------------------
		BiPredicate<Person, Person> biPred = (p1, p2) -> {
			return p1.equals(p2); // added equals() method in Person class
		};

		Person p1 = new Person(101, "Mira", "Delhi");
		Person p2 = new Person(101, "Mira", "Delhi");

		System.out.println(biPred.test(p1, p2));
		// ---------------------------------------------------------------------
		BiFunction<Person, Person, String> bifun = (person1, person2) -> {
			String str = "Both leaves in different city";
			if (person1.getCity().equals(person2.getCity())) {
				str = person1.getName() + " and " + person2.getName() + " belongs to same city " + person1.getCity();
			}
			return str;

		};

		Person p11 = new Person(101, "Mira", "Delhi");
		Person p22 = new Person(102, "Sam", "Pune");

		System.out.println(bifun.apply(p11, p22));
		// ---------------------------------------------------------------------
		BiConsumer<Integer, Person> biCon = (num, person) -> {
			Map<Integer, Person> map = new HashMap<>();
			map.put(num, person);
			System.out.println(map);
		};

		Person person = new Person(110, "Mary", "Hyderabad");
		biCon.accept(person.getId(), person);
		// ---------------------------------------------------------------------
		Person p111 = new Person(101, "Mira", "Delhi");
		Person p222 = new Person(102, "Sam", "Pune");

		BinaryOperator<Person> binOp1 = BinaryOperator.maxBy(new PersonComparator());
		System.out.println("MAX ID is " + binOp1.apply(p111, p222));

		BinaryOperator<Person> binOp2 = BinaryOperator.minBy(new PersonComparator());
		System.out.println("MIN ID is " + binOp2.apply(p111, p222));
		// ---------------------------------------------------------------------

		UnaryOperator<String> unaryOp = UnaryOperator.identity();
		System.out.println(unaryOp.apply("Welcome"));

		UnaryOperator<Integer> unaryOp2 = i -> i * i;
		System.out.println(unaryOp2.apply(12));

		UnaryOperator<Person> unaryOp3 = (Person) -> {
			int id = person.getId() + 1;
			String name = "Mr. " + person.getName();
			return new Person(id, name, person.getCity());
		};
		Person pop1 = unaryOp3.apply(p111);
		System.out.println(pop1);
	}

}
