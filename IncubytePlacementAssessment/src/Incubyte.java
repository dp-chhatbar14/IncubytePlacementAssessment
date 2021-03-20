public class Incubyte {

	int Add (String numbers) throws Exception
	{
		if(numbers.equals(""))
		{
			return 0;
		}
		int sum = 0;
		String[] nums;
		
		String delimeters = ",|\\\n";
		if(numbers.indexOf("//")==0)
		{
			String d = numbers.substring(numbers.indexOf("//")+2, numbers.indexOf("\n"));
			numbers = numbers.substring(numbers.indexOf("\n")+1);
			
			for (int i=0;i<d.length();i++)
			{
				if (d.charAt(i)=='[')
				{
					delimeters= delimeters+"|";
				}
				else if (d.charAt(i)!=']')
				{
					delimeters= delimeters+"\\"+d.charAt(i);
				}
			}
		}
		nums= numbers.split(delimeters);
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