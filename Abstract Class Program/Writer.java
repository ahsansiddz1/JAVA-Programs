	abstract class Writer
	{
		public abstract void write();	//we can also use protected but not private
	}

	
	class main{
		public static void main(String args[]) {
	    	Writer pc=new Writer()
	    	{
	    			public void write()
		{
			System.out.print("I am a pen");
		}
	    	};
	    	
	    }
	}