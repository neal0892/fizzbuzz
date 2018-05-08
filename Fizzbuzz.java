import java.util.Scanner;

public class Fizzbuzz {

public static void main(String[] args) throws InterruptedException {

	Scanner  s= new Scanner(System.in);
	int input = s.nextInt();
	for(int i = 1 ;i<input;i++)
	{
		if(i%3==0 && i%5==0)
			System.out.println("fizzbuzz");
		else if (i%3==0)
			System.out.println("fizz");
		else if(i%5==0)
			System.out.println("buzz");
		else
			System.out.println(i);
		Thread.sleep(500);
	}
}

}
