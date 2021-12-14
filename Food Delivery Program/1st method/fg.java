class FGDelivery {
	//Attributes
	protected String name;
	protected String address;
	protected String receipent;
	protected double weight;
	protected double costPerPound;
	
	//Default constructor
	public FGDelivery (){	}
	
	//Constructor with Multiple Parameters
	public FGDelivery (String name, String address, String receipent, double weight, double costPerPound)
	{
		this.name = name;
		this.address = address;
		this.receipent = receipent;
		this.weight = weight;
		this.costPerPound = costPerPound;
	}

	//Accessors
	public String getName() {return name;}
	public String getAddress() {return address;}
	public String getReceipent() {return receipent;}
	public double getWeight() {return weight;}
	public double getCostPerPound(){ return costPerPound;}
	
	//Mutators
	public void setName(String name)
	{
		this.name = name;
    }
    public void setAddress(String address)
	{
		this.address = address;
    }
    public void setReceipent(String receipent)
	{
		this.receipent = receipent;
    }
    public void setWeight(double weight)
	{
		this.weight = weight;
    }
	public void setCostPerPound(double costPerPound)
	{
		this.costPerPound = costPerPound;
    }
	
	//Method
	public double GetCost()
	{
		return this.weight * this.costPerPound;
	}
	
	public void print()
	{
		System.out.print("Name = " + getName() + "\nAddress = " + getAddress() + "\nReceipent = " + getReceipent() + "\nWeight in pounds = " + getWeight() + "\nCost Per Pound = " + getCostPerPound());
	}
	
}

class HalfHourFGDelivery extends FGDelivery{
	//Attribute
	protected double additionFee;
	
	//Default Constructor
	public HalfHourFGDelivery(){	}
	
	//Constructor with Multiple Parameters
	public HalfHourFGDelivery(String name, String address, String recipient, Double weight, Double costPerPound, Double additionFee) 
	{
		super(name, address, recipient, weight, costPerPound);
		this.additionFee = additionFee;
    }
    
    //Accessor
    public double getAdditionFee(){return additionFee;}
	
	//Mutator
	public void setAdditionFee(double additionFee)
	{
		this.additionFee = additionFee;
  	}
	
	//Method Overriding
	public double GetCost()
	{
		double hCost = super.GetCost();
		costPerPound = hCost + this.additionFee;
		
		return costPerPound;
	}
		public void print ()
	{
		System.out.print("\nHalf Hour Deliver Cost = " + costPerPound);
	}
}

class OneDayFGDelivery extends FGDelivery{
	//Attribute
	protected double fixedFee;
	
	//Default Constructor
	public OneDayFGDelivery() {}

	//Constructor With Multiple Parameter
    public OneDayFGDelivery(String name, String address, String recipient, Double weight, Double costPerPound, Double fixedFee) 
    {
        super(name, address, recipient, weight, costPerPound);
        this.fixedFee = fixedFee;
    }

	//Accessor
	public double getFixedFee(){return fixedFee;}
	
	//Mutator
	public void setFixedFee(double fixedFee)
	{
		this.fixedFee = fixedFee;
  	}
	
	//Method Overriding
	public double GetCost()
	{
		double bCost = super.GetCost();
		costPerPound = bCost + fixedFee;

		return costPerPound;
	}
	public void print ()
	{
		System.out.print("\nOne Day Delivery Cost = " + costPerPound);
	}
}

 class TestClass
{
	public static void main (String [] args)
	{
		FGDelivery FG1 = new FGDelivery("Vishal", "Haji Latif Shah Road Shikarpur", "Lakhi Gate Shikarpur", 75.0, 100.0);
		OneDayFGDelivery OD1 = new OneDayFGDelivery("Vishal", "Haji Latif Shah Road Shikarpur", "Lakhi Gate Shikarpur", 75.0, 100.0, 300.0);
		HalfHourFGDelivery HA1 = new HalfHourFGDelivery("Vishal", "Haji Latif Shah Road Shikarpur", "Lakhi Gate Shikarpur", 75.0, 100.0, 500.0 );
		
		FG1.GetCost();
		FG1.print();
		
		OD1.GetCost();		System.out.print("\n\nOne Day Delivery Fee = " + OD1.fixedFee);
		OD1.print();
		
		HA1.GetCost();		System.out.print("\n\nHalf Hour Delivery Fee = " + HA1.additionFee);
		HA1.print();
	}
}