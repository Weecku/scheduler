import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String args[]) throws IOException
	{
		
		FileInputStream fis = new FileInputStream("c:\\1.txt"); //����� ��� ����� ������ �� �����
		InputStreamReader sreader = new InputStreamReader(fis); //����� �������� ������
		BufferedReader br = new BufferedReader(sreader); //BufferedReader ������ �� ������
				           							
		
		
		List<String> fileContent = new ArrayList<String>() ;
		   String str;
		   
		   Booking book;
		   while( (str = br.readLine() ) != null )
		   {
		        fileContent.add(str);
		       // System.out.println(str);
		    //    System.out.println(str.split("-"));
		    //    System.out.println
			    //  (java.util.Arrays.toString(str.split(" ")) + "  jkjhjkhj");
		       
		       // System.out.println();
		       // System.out.println();
		      //  System.out.println(str);
		   }
		   System.out.println();
				   System.out.println();
		    System.out.println(fileContent);
		
		//    book = new Booking(fileContent);
		    
		    for(int i = 1; i<fileContent.Length; i++)
	        {
	        	book = new Booking();
	        	book.bookDate = fileContent.get(i);
	        	
	        	//if(empID.set)
		    	//continue;
	        }
		    System.out.println(fileContent.get(0));
	}
	

}
//�����-�������  ������

class Booking
{
	private static final int MILIS_IN_HOUR = 60*60*1000;
	Date bookDate;
	Date startDate;
	long hours;
	Date endDate = new Date(startDate.getTime() + hours * MILIS_IN_HOUR);
	String empID;
//	Booking();
	//Booking(Date bookDate, Date nDate, Date startDate, Date endDate, int hours, int empID)  //Booking(fileContent)
	//{
		//this.bookDate = bookDate;
		//this.nDate = nDate;
		//this.startDate = startDate;
		//this.endDate = endDate;
		//this.hours = hours;
	//	this.empID = empID;
		
	//}
	
}