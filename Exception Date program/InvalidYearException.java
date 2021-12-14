class InvalidYearException extends RuntimeException

		{

		public 	InvalidYearException()
			
				{
					System.out.println("**********************");
					System.out.println("Invalid Year");
					System.out.println("**********************");
				}
				public 	InvalidYearException(String s)
			
				{
					
					super(s);
				}
			

		}