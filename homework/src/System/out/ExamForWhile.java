package System.out;

import java.util.Scanner;

public class ExamForWhile {
	public static void main(String[] args){
		
		Scanner B =	new Scanner(System.in);
	System.out.println("1. 1���� �Է��� ������ ���ϱ�");
	System.out.println("2. �ִ�/�ּҰ� ���ϱ�");
	System.out.println("3. �Է¹��������� �հ�� ��� ���ϱ�");
	System.out.println("4. ���ϴ� ������ ����ϱ�");
	System.out.println("5. ¦����/Ȧ���� ����ϱ�");
	System.out.println("6. �����ϱ�");
	System.out.println("���ϴ� �޴��� ? ");
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
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
}
	
}
}