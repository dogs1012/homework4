package System.out;

import java.util.Scanner;

public class GuGuDan {
	void gugu(){
		
	  Scanner s = new Scanner(System.in); 
	  System.out.println("���ϴ� ������ ����ϱ�"); 
	  while(true){
		  System.out.print("����ϰ� ���� ��(Q:����)>>"); 
		   String gu = s.nextLine();
		   if(gu.equals("q"))  { 
			   			   break; 
		   }
		   else if(Integer.parseInt(gu) >1 && Integer.parseInt(gu)<10){
			   for(int i = 1; i<10 ; i++){ 
			  if(i%2 == 0) 
			  System.out.print(+Integer.parseInt(gu)+"*"+i+ "="+Integer.parseInt(gu)*i+"\n"); 
			  else 
         	  System.out.print(+Integer.parseInt(gu)+"*"+i+ "="+Integer.parseInt(gu)*i+"\n"); 
				   } 
			  

		   }
		   else 
	 	   { 
			   System.out.println("===> �߸��Է�"); 
		   } 
	  }
	  }


}
