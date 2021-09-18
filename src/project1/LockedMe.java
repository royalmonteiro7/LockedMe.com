package project1;
import java.util.Scanner;

public class LockedMe {
	public static void main(String[] args) throws Exception {
		Welcomescreen w1=new Welcomescreen();
		FileHandling filehand=new FileHandling();
		Scanner s=new Scanner(System.in);
		w1.welcomeScreen();
		String filename;
		
		while(true) {
			w1.optionscreen();
			System.out.println();
			System.out.println("Select option");
			int choice=s.nextInt();
			
			switch(choice) {
			case 1:
				filehand.displayfiles();
				break;
				
			case 2:
				boolean innerStatus= true;
				while(innerStatus) {
					w1.inneroptionscreen();
					System.out.println();
					System.out.println("Enter your option: ");
					int inneroption=s.nextInt();
					
					switch(inneroption) {
					case 1:
						System.out.println("Enter file name: ");
						filename=s.next();
						s.nextLine();
						filehand.createFile(filename);
						System.out.println();
						System.out.println("Want to add something in a file please select yes or no (Y/N) or (y/n) :");
						char inneraction = s.next().charAt(0);
						s.nextLine();
						
						while(true) {
							if(inneraction =='y'||inneraction=='Y') 
							{
								System.out.println("enter what you write in a file: ");
								String data = s.next();
								s.nextLine();
								filehand.write(filename, data);
								break;
							}
							if(inneraction=='n'||inneraction=='N') 
							{
								break;
							}
							else 
							{
								System.out.println("please enter Y/N or y/n: ");
								inneraction = s.next().charAt(0);
								s.nextLine();
							}
						}
						break;

					case 2:
						System.out.println("Enter file to delete: ");
						filename = s.next();
						s.nextLine();
						filehand.deletefile(filename);
						System.out.println();
						break;
						
					case 3:
						System.out.println("Enter file which you want to search: ");
						filename = s.next();
						s.nextLine();
						filehand.searchfile(filename);
						System.out.println();
						break;
						
					case 4:
						innerStatus = false;
						break;
						
					default:
						System.out.println("enter correct option");
						System.out.println();
						break;
					}
				}
				break;
				
			case 3:
				System.out.println("app closed successfully");
				System.out.println();
				System.exit(0);
				break;
			
			default:
				System.out.println("enter correct option");
				System.out.println();
				break;
			}
		}
	}
}