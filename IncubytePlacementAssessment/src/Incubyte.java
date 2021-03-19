public class Incubyte {

	int Add (String numbers) throws Exception
	{
		if(numbers.equals(""))
		{
			return 0;
		}
		int sum = 0;
		String[] nums;
		nums= numbers.split(",|\\\n");
		int l= nums.length;
		try {
		if(l>5) {throw new Exception("More than 5 numbers");}
		int i=0;
		while (i<l)
		{
			int num=Integer.parseInt(nums[i]);
			if(num>0) 
			{
				if(num<1000) 
				{
					sum=sum+num;
				}
				i=i+1;
				
			}
			else{throw new Exception("Negative numbers not allowed");}
		}
		return sum;
		}
		finally {}
		}
}