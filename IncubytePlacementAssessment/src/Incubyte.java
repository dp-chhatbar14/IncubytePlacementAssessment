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
			sum=sum+Integer.parseInt(nums[i]);
			i=i+1;
		}
		return sum;
		}
		finally {}
		}
}