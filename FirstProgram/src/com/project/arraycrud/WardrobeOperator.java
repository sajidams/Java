package com.project.arraycrud;

public class WardrobeOperator {
	
	String[] store= new string[6];
	int count;
	
	public boolean add(String thing)
	{
		if(thing!=null && this.count<store.length)
		{
			System.out.println("Invoked add()");
			this.store[count]=thing;
			System.out.println("Thing added: "+thing);
			count++;
			return true;
		}
		else
		{
			System.err.println("Thing is not added..count is empty");
		// err means message will be printed in red
			
			
		return false;
		
	}
		
		public boolean update(int index, String newThing)
		{
			
			if(newThing!=null && index<store.length)
			{
				System.out.println("Invoked update()");
				this.store[index]=newThing;
				String whichDress= store[index];
				System.out.println("Thing is updated:"+whichDress);
				
				return true;
				
			}
			
			else
				
			{
				
				System.err.println("Thing is not updated:");
			}
			return false;
		}

		
		public boolean match(String thing)
		{
			for (int dress=0;dress<this.store.length;dress++)
			{
				String tempThing = this.store[dress];
				
				if(tempThing!=null){
					if(tempThing!=thing){
						
						System.out.println("Thing is matching:"+thing);
						return true;
					}
				}
				
			}
			System.err.println("Sorry, thing is not matching");
			return false;
		}
			
			
			
			
		}
	
	
	public boolean delete(int index)
	{
		if(index<this.store.length)
			this.store[index]=null;
		System.out.println("Thing is pointing to null...this is deleted");
		return true;
	}
	
	else
	{
		System.out.println("Thing is not pointing to null");
	}
		
}
