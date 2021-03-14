package chap01;

import java.util.Scanner;

public class Judge123A {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		int n = stdIn.nextInt();
		
		if (n == 1)
			System.out.println("이 수는 1입니다.");
		else if (n == 2)
			System.out.println("이 수는 2입니다.");
		else if (n == 3)
			System.out.println("이 수는 3입니다.");
		
//		if (n == 1)
//			System.out.println("이 수는 1입니다.");
//		else if (n == 2)
//			System.out.println("이 수는 2입니다.");
//		else if (n == 3)
//			System.out.println("이 수는 3입니다.");
//		else // 공백문(실제로 아무것도 하지 않는 문장)
//			;
//		위의 식과 동일
//		실제로는 4가지로 분기
		
//		if (n == 1)
//			System.out.println("이 수는 1입니다.");
//		else if (n == 2)
//			System.out.println("이 수는 2입니다.");
//		else 
//			System.out.println("이 수는 3입니다.");
//		'if문 else if문 else문' 구성으로 3가지로 분기
	}

}
