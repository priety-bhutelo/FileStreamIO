package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileInputStreamUtil;
import com.montran.util.FileOutputStreamUtil;

public class FileStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ioChoice;
		String employeeId;
		String salary;
	    String name;
		int filelength;
		String filepath;
		String choice;
		File file;
		byte[] fileData;
		//byte[] id;
		//byte[] employeename;
		//byte[] employeeSalary;
		
		Scanner scanner=new Scanner(System.in);
		do
		{
		
		System.out.println("1..Write a file");
		System.out.println("2..Read a file");
		System.out.println("Enter choice");
		ioChoice=scanner.nextInt();
		
		switch (ioChoice) {
		case 1: {
			
			System.out.println("Enter path");
			filepath=scanner.next();
			file=new File(filepath);
			FileOutputStreamUtil fileOutputStreamUtil=new FileOutputStreamUtil();
			
			scanner.nextLine();
			System.out.println("Enter EmployeeId");
			employeeId=scanner.nextLine();
			
			
			System.out.println("Enter name");
			name=scanner.nextLine();
			
			System.out.println("Enter salary");
			salary=scanner.nextLine();
			
			
			
			fileOutputStreamUtil.writeDataIntoFile(file,employeeId.getBytes(),name.getBytes(),salary.getBytes());
			
				
			System.out.println("Please check your file !!");
			
				
					
			
		break;
		}
		case 2: {
			System.out.println("Enter path");
			filepath=scanner.next();
			file=new File(filepath);
			
			FileInputStreamUtil fileInputStreamUtil=new FileInputStreamUtil();
			
			fileData=fileInputStreamUtil.getFileData(file);
			System.out.println("Data From File");
			for (byte b : fileData) {
				System.out.print((char) b);
			}
		
			
			
			
			break;
			}
		default:
			System.out.println("Invalid choice");
		}
		
		System.out.println("Do you want to continue");
		choice=scanner.next();
		
		}while(choice.equals("yes"));
		scanner.close();
	}
}
