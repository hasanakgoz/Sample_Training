package example;

public class One {
	String message = "foo";

	public String foo() {
		return message;
	}

	public void uncoveredMethod() {
		System.out.println(foo());
	}
	
	
	// Cookie c = new Cookie(SECRET, secret); // Noncompliant; cookie is not
	// secure
	// response.addCookie(c);
}
