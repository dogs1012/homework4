package System.out;

import java.util.Scanner;

public class MaxAndMin {
	void max(){
		Scanner s = new Scanner(System.in);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

		
		while(true){
			System.out.print("0~100������ ���ڸ� �Է�(Q�� ����)>>");
			String n = s.nextLine();		
			if(n.equals("q"))
				break;	
			else {
				
				int num = Integer.parseInt(n); 
							if (num > max){ 
							max = num;} 
								if(min > num){ 
							min = num; 

			}
		System.out.print("���� ū ����" +max+ "�̰� ��������" +min+"�Դϴ�.\n");
		}
	}
	}
}

