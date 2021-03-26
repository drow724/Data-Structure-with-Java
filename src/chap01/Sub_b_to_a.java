package chap01;

import java.util.Scanner;

public class Sub_b_to_a {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int a,b;
		
		System.out.println("a의 값 :");
		a = stdIn.nextInt();
		
		System.out.println("b의 값 :");
		b = stdIn.nextInt();
		
		while(true){
			if (a>b) {
				System.out.println("a보다 큰 값을 입력하세요!");
				b = stdIn.nextInt();
			}
			else {
				break;
			}
		}
		System.out.println("b - a는 " + (b-a) + "입니다.");
	}

}
