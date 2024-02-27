package string1;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld s = new HelloWorld();
		System.out.println(s.helloName("Sandy"));
	}

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

}
