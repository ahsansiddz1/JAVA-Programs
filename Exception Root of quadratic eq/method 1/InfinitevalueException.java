 class InfinitevalueException extends RuntimeException{
	InfinitevalueException(double a)
	{
		System.out.println(a+" is invalid \n error :: Something divide by zero equals infinite value");
	}
}