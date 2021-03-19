public class Incubyte {

	int Add (String numbers)
	{
		if(numbers.equals(""))
		{
			return 0;
		}
		int sum = 0;
		String[] nums;
		nums= numbers.split(",");
		int l= nums.length;
		
		int i=0;
		while (i<l)
		{
			sum=sum+Integer.parseInt(nums[i]);
			i=i+1;
		}
		return sum;
	}
}