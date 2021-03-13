package chap01;
//3개의 정수값 가운데 최대값을 구하여 출력하자
import java.util.Scanner;

public class Max3m {
	//a,b,c의 최댓값을 구하여 반환하도록 하자
	static int max3(int a, int b, int c) {
		//메소드를 정의할 때 메소드에 전달되는 값을 저장하기 위해 변수(variable)를 선언하는데, 이를 매개변수(parameter) 또는 형식매개변수(formal parameter)라고 한다.
		//int a, int b, int c는 max3 메소드의 가인수(假因數)
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	// 최대값을 여러번 반복해서 구하는 경우, 메서드로 처리하면 편리하다.
	// max3 메소드는 int형 매개변수a,b,c의 값을 받아 최댓값을 구하고 그것을 int형 값으로 반환하는 메소드이다.
	
		public static void main(String[] args) {
			System.out.println("max(3,2,1) = " + max3(3,2,1)); //[A] a>b>c
			//메소드를 호출할 때 사용하는 매개변수의 값(Value)을 실인수라고 한다.
			//3,2,1은 max3 메소드를 호출할 때 사용하는 실인수(actual argument)
			System.out.println("max(3,2,2) = " + max3(3,2,2)); //[B] a>b=c
			System.out.println("max(3,1,2) = " + max3(3,1,2)); //[C] a>c>b
			System.out.println("max(3,2,3) = " + max3(3,2,3)); //[D] a=c>b
			System.out.println("max(2,1,3) = " + max3(2,1,3)); //[E] c>a>b
			System.out.println("max(3,3,2) = " + max3(3,3,2)); //[F] a=b>c
			System.out.println("max(3,3,3) = " + max3(3,3,3)); //[G] a=b=c
			System.out.println("max(2,2,3) = " + max3(2,2,3)); //[H] c>a=b
			System.out.println("max(2,3,1) = " + max3(2,3,1)); //[I] b>a>c
			System.out.println("max(2,3,2) = " + max3(2,3,2)); //[J] b>a=c
			System.out.println("max(1,3,2) = " + max3(1,3,2)); //[K] b>c>a
			System.out.println("max(2,3,3) = " + max3(2,3,3)); //[L] b=c>a
			System.out.println("max(1,2,3) = " + max3(1,2,3)); //[M] c>b>a
			
		}
}

//알고리즘이란??
//문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한개의 규칙으로 이루어진 집합