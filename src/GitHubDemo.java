import org.testng.annotations.Test;

public class GitHubDemo {
@Test
public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Addition:"+c);
}
@Test
public void sub() {
	int a=10;
	int b=20;
	int c=b-a;
	System.out.println("Subtraction:"+c);
}
}
