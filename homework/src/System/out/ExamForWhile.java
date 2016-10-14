package System.out;

import java.util.Scanner;

public class ExamForWhile {
	public static void main(String[] args){
		
		Scanner B =	new Scanner(System.in);
	System.out.println("1. 1부터 입력한 수까지 더하기");
	System.out.println("2. 최댓값/최소값 구하기");
	System.out.println("3. 입력받은숫자의 합계와 평균 구하기");
	System.out.println("4. 원하는 구구단 출력하기");
	System.out.println("5. 짝수단/홀수단 출력하기");
	System.out.println("6. 종료하기");
	System.out.println("원하는 메뉴는 ? ");
	int A = B.nextInt();
	
		
	switch(A){
		case 1 :
		new SumOfNumbers().hap();			
		case 2 :
		new MaxAndMin().max();
		case 3 :
		new	SumAndAvg().avg();
		case 4 :
		new	GuGuDan().gugu();
		case 5 :
		new	GuGuDan2().gugu2();
		case 6 :
		System.exit(0); 
		default :
			System.out.println("잘못입력하셨습니다.");
}
	
}
}