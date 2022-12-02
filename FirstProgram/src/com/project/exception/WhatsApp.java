package com.project.exception;
// File.java, and this class related
public class WhatsApp {
	
	public void createGroup(String[] names)
	{
		if(names.length>5)
		{
			throw new WhatsAppException("Cant create group with more than 5 members");
			
		}
		
		else
			System.out.println("Yours whatsapp group created successfully");
	
	public void shareFile(File file)
	if (file.size>1000)
		throw.new WhatsAppException("Invalid file size")
	else
		System.out.println("File is uploaded successfully");
	
	
	
	}
	
	
	
	

}
