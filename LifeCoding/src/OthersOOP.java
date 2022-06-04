import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
public static void main(String[] args) throws IOException{
	// class : System, Math, FileWriter
	// instance : f1, f2
	System.out.println(Math.PI);
	System.out.println(Math.floor(1.8)); // floor = 내립
	System.out.println(Math.ceil(1.8)); // ceil = 올림
	
	FileWriter f1 = new FileWriter("data.txt");
	f1.write("Hello");
	f1.write(" Java");
	f1.close();
	
	FileWriter f2 = new FileWriter("data2.txt");
	f2.write("Hello");
	f2.write(" Java2");
	f2.close();
	}

}
/* 내가 이해한 것은
자바가 객체 지향 프로그램이라고 했는데
클래스랑 인스턴스 모두 객체인가?
교재에서 배운게 뭐였더라

인스턴스는 클래스(변수, 메소드의 집합을 통해 기능함)를 복제하여
해당 클래스의 기능을 기반으로 작동하는 새로운-그러나 복제본인 객체
FileWriter f1 = new FileWriter("data.txt");
따라서 이 코드에서 좌측의 FileWriter는 f1의 타입으로서 쓰여진 것이다.

인스턴스는 클래스 (변수+메소드의 집합체)를 복사한 후 새로운 이름을 부여하여 선언한 것

System.out.println() 에서 System 은 앞에서 말했듯이 class다.
여기서 out은 printStream 이라는 클래스의 객체로써 static 변수.
printStream 클래스는 System 클래스 안에 존재하는 Inner 클래스이며
이 printStream 클래스의 메소드 중 하나가 println

자바라는 언어가 사용자가 그 내부의 작동 방법을 몰라도 쓸 줄 아는 언어라는 이유가
약간은 이해가 간다.

*/