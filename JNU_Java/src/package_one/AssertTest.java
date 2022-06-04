package package_one;

public class AssertTest {
	public static void throwTest() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		try {
			System.out.println("try ");
			throwTest();
		} catch (Exception e) {
			System.out.println("catch ");
		} finally {
			System.out.println("finally ");
		}
		System.out.println("end");
	}
}