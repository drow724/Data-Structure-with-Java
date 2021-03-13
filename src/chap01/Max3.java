package chap01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		
		int max = a ;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최대값은 " + max + "입니다.");
	}
}

//1. max에 a 값을 넣는다.
//2. b값이 max보다 크면 max에 b값을 넣는다.
//3. c값이 max보다 크면 max에 c값을 넣는다.
//
//세 문장이 아래로 나란히 있다면 이 문장은 순서대로 실행.
//여러 문장(프로세스)이 순차적으로 실행되는 구조를 순차적(concatenation)구조라고 한다.
//
//--------------------------------------------------------------------
//
//1. max에 a 값을 넣는다.
//↳1번 문장은 단순한 대입
//
//--------------------------------------------------------------------
//
//2. b값이 max보다 크면 max에 b값을 넣는다.
//3. c값이 max보다 크면 max에 c값을 넣는다.
//↳2,3번 문장은 if문으로, ()안에 있는 식의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection)구조라고 합니다.