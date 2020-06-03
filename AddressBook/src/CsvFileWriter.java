import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class CsvFileWriter {

	 final static String head= "FirstName LastName City State ZipCode \n";
	 public static void writefile(ArrayList<Person> person)
	 		{
			FileWriter fileWriter = null;
			FileReader fileReader = null;
			try
			{
				fileWriter = new FileWriter("addressbook.csv",true);
				fileReader = new FileReader("addressbook.csv");
				if((fileReader.read()) != 0)
				{				
					for(Person p: person)
					{
						fileWriter.append(p.getFirstName());
						fileWriter.append(",");
						fileWriter.append(p.getLastName());
						fileWriter.append(",");
						fileWriter.append(p.getPhone());
						fileWriter.append(",");
						fileWriter.append((CharSequence) p.getAddress());
						fileWriter.append(",");
						fileWriter.append(p.getZipCode());
						fileWriter.append(",");
			
						fileWriter.append("\n");
					}
				}
				else
				{
					fileWriter.append(head);
					fileWriter.append("\n");
					for(Person p: person)
					{
						fileWriter.append(p.getFirstName());
						fileWriter.append(",");
						fileWriter.append(p.getLastName());
						fileWriter.append(",");
						fileWriter.append(p.getPhone());
						fileWriter.append(",");
						fileWriter.append((CharSequence) p.getAddress());
						fileWriter.append(",");
						fileWriter.append(p.getZipCode());
						fileWriter.append(",");
					
						fileWriter.append("\n");
					}
				}
				
			}
			catch(IOException e)
			{
				System.out.println("error");
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fileWriter.flush();
					fileWriter.close();
				}
				catch(IOException e)
				{
					System.out.println("flushing not done");
					e.printStackTrace();
				}
			}
		}
	  
	 
//	 static FileWriter fw =null;
//	 
//	 public static  void writefile(ArrayList<Person>person) throws IOException {
//		 System.out.println("Person "+person);
//		 try {
//			 ;
//			fw = new FileWriter("addressbook.csv");
//			
//			for(Person p:person) {
//					//pw.println(p.getFirstName()+","+p.getLastName()+","+p.getAddress()+","+p.getZipCode()+","+p.getPhone() );
//						fw.append(head);
//						fw.append(p.getFirstName());
//						fw.append(",");
//						fw.append(p.getLastName());
//						fw.append(",");
//						fw.append((CharSequence) p.getAddress());
//						fw.append(",");
//						fw.append(p.getPhone());
//						fw.append(",");
//						fw.append(p.getZipCode());	
//						
//				}
//				System.out.println("Written SuccessFull	y ");
//		} 
//		 catch (Exception e) {
//			System.out.println("Exception Occured");
//			e.printStackTrace();
//		 }
//		 finally {
//			try {
//				fw.flush();
//				fw.close();
//			} catch (IOException e) {
//				
//				System.out.println("Flushing/closing Error");
//				e.printStackTrace();
//				}
//		}
//		}
		 
	 }
	

