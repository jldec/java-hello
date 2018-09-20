package functions;

import java.util.function.Function;

public class Hello implements Function<String, String> {

	public String apply(String name) {
		return "Hello " + name;
	}
}
