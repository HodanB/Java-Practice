package qa.com.HelloWorldIntro;

public class HelloWorld {

	public static void main(String[] args) {
		noReturn();
	}
	public static void noReturn() {
		System.out.println("this works but no return type");
	}
	public static String withReturn() {
		return "this is working fine!";
	}
}
