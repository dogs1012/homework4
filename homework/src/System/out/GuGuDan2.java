package System.out;

import java.util.Scanner;

public class GuGuDan2 {
	void gugu2(){
		  Scanner s = new Scanner(System.in); 
		  System.out.println("���ϴ� ������ ����ϱ�"); 
		  while(true){
			  System.out.print("����ϰ� ���� ��(Q:����)>>"); 
			   String gu = s.nextLine();			  
			   if(gu.equals("E")){							 
				   for(int i = 1; i<10 ; i+=2){ 
					   for(int j = 1; j <9 ; j++)
					   System.out.printf("%d * %d = %d    ", j , i , j*i); 
			   }
			    if(gu.equals("O"))
			    	for(int i=2 ;i< 10; i+=2)
		 	   { 
				    for(int j=1;j<9;j++)
				    {
				    	System.out.printf("%d * %d = %d    ", j , i , j*i);
				    }
			   } 
		  }
			   else if(gu.equals("q")) 
				  		   break; 

		  }
		  
		  


		
	}
}
