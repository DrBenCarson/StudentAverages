import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentAverages {

	public static void main(String[] args) throws IOException {
		Scanner fileTaker=new Scanner(new File("E:\\StudenAverages1\\StudentScores.in"));
		int aa=-1;
		String xyz[]=new String[1000];
		while (fileTaker.hasNext())
		{
			aa++;
			xyz[aa]=fileTaker.nextLine();
		}
		fileTaker.close();
		String total="";
		int sum=0;
		int average=0;
		for (int i=0;i<aa+1;i++)
		{
			Scanner intArray=new Scanner(xyz[i]);
			String name=intArray.next();
			sum=0;
			average=0;
			while (intArray.hasNextInt())
			{
				average +=intArray.nextInt();
				sum++;
				System.out.println(name+": "+ (average/sum));
				//if (!intArray.hasNextInt())
				
					System.out.println(average/sum);
				
			
			}
		}
			
		
		
	}

}
