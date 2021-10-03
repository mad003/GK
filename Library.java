package CSLab;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Library {
	
	public static void add_book() throws IOException{
		File file=new File("DATA.txt");
      // if(file.createNewFile()){}
        //int Book_ID=0;
//        # try  
//         {   
//         FileInputStream fis=new FileInputStream("DATA.txt");       
//         Scanner sc=new Scanner(fis);   
//         String s="0"; 
//         while(sc.hasNextLine())  
        {  
        s=sc.nextLine();  
        }  
        char ch1 = s.charAt(0);
        Book_ID=Character.getNumericValue(ch1); 
        }
        catch(Exception e)  
        {  
        	System.out.println("[-] Error accured!"); 
        }
        Book_ID++;  
        
        Scanner scan=new Scanner(System.in);
        String Book_title,Publisher,Author;
        int Total;
		
        System.out.println("[+] Enter Book title: ");
		Book_title = scan.next();
		System.out.println("[+] Enter Publisher name: ");
		Publisher = scan.next();
		System.out.println("[+] Enter Author name: ");
		Author = scan.next();
		System.out.println("[+] Enter Total Number of coppies: ");
		Total = scan.nextInt();
		
		try {
			FileWriter file_new = new FileWriter(file, true);
			PrintWriter PW = new PrintWriter(file_new);
			
			PW.println(Book_ID +" | " + Book_title + " | " + Publisher + " | " + Author + " | " + Total);
            Book_ID++;
            file_new.close();
		}
		catch(Exception e) {
			System.out.println("[-] Error accured!");
		}
	}
	
	public static void search_book() throws IOException {
		System.out.println("[+] Enter the name you would like to search: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
    
        List<String> lines = Files.readAllLines(Paths.get("DATA.txt"));
        for (String line : lines) {
            if (line.contains(name)) {
                System.out.println("\n\n" + line + "\n\n");
            }
        }
	}
	
	public static void issue_book() {
		
	}
	
	public static void return_book() {
		
	}
	
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("[+] Choose any one option: ");
			System.out.println("[+] 1. Add a book ");
			System.out.println("[+] 2. Search a book ");
			System.out.println("[+] 3. Issue a book ");
			System.out.println("[+] 4. Return a book ");
			System.out.println("[+] 5. Exit ");
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
				add_book();break;
			case 2:
				search_book();break;
			case 3:
				issue_book();break;
			case 4:
				return_book();break;
			case 5:
				System.exit(0);
			}
		}
	}
}
