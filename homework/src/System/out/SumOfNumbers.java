package System.out;

import java.util.Scanner;

public class SumOfNumbers {
	void hap(){
		Scanner s = new Scanner(System.in);
		int	sum= 0;
		while(true)	{
			
		System.out.print("������ ���� �Է�(Q�� ����)>>");
		String n = s.nextLine();		
		if(n.equals("q"))
			break;	
		else 	{
			int j = Integer.parseInt(n);
		
			for(int i=1; i<=j; i++)
				sum = sum + i;
		}
	
		System.out.println("�� ���� "+sum+" �Դϴ�.");
		}
		
	}
	
}		
	
		
