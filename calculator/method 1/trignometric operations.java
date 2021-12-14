class trignometric_operations implements calculator{
	double num;
 public	trignometric_operations(double  a)
	{
		num=a;
	}
	
	public double radtodeg()
	{
		return num*57.2;
	}
	
	public double degtorad()
	{
		return num*0.0174533;
	}
	public double sininrad()
	{
		return Math.sin(num/57.2958);
	}
		public double sinindeg()
	{
		return Math.sin(num);
	}
	
	public double cosinrad()
	{
		return Math.cos(num/57.2958);
	}
		public double cosindeg()
	{
		return Math.cos(num);
	}
	
	public double taninrad()
	{
		return Math.tan(num/57.2958);
	}
		public double tanindeg()
	{
		return Math.tan(num);
	}

	
}