class boxsample{
	
	int width;
	int height;
	int depth;
	
	int volume()
	{
		return width*height*depth;
	}
	//getting dimensions with parameterizzed constructor
	boxsample(int w, int h, int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
}

	class Box{
		
		public static void main(String args[]) {
	    	
	    
		boxsample mybox1=new boxsample(1,32,3);
		boxsample mybox2=new boxsample(0,22,2);
		
		System.out.println("volume 1 is : " + mybox1.volume());
		System.out.println("volume 2 is : " + mybox2.volume());
	}
	}