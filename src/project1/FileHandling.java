package project1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

class FileHandling {
public void createFile(String filename) throws Exception{
		File file = new File("new folder//"+filename);
		if(file.exists()) 
		{
			System.out.println("file already exists");
		}
		else 
		{ 
			file.createNewFile();
		System.out.println(filename+" file created successfully");	
		}
}
public void deletefile(String filename) throws Exception{
		File file = new File("new folder//"+filename);
		if(file.exists()) 
		{
			file.delete();
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File doesnot exist to delete");
		}
}
public void searchfile(String filename) {
		File file = new File("new folder//"+filename);
		if(file.exists()) 
		{
			System.out.println("file found with same name");
		} 
		else 
		{
			System.out.println("no file found with this name");
		}
}
public void displayfiles(){
		File folder=new File("new folder//");
		File listoffile[]=folder.listFiles();
		String filenames[]=new String[listoffile.length];
		for(int i=0;i<filenames.length;i++) 
		{
			filenames[i] = listoffile[i].getName();
		}
		for(int i=0;i<filenames.length;i++) {
			for(int j=i+1;j<filenames.length;j++) {
				if(filenames[i].compareTo(filenames[j])>0) 
				{
					String temp = filenames[i];
					filenames[i] = filenames[j];
					filenames[j] = temp;
				}
			}
		}
		for(int k = 0;k<filenames.length;k++) 
		{
			System.out.print(filenames[k]+" ");
		}
		System.out.println();
}
public void write(String filename,String data) throws Exception{
		File file=new File("new folder//"+filename);
		PrintWriter w=new PrintWriter(new FileWriter(file, true));
		w.print(data);
		w.close();
	}
}