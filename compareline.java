public class compareline
{
	public static void main(String[] args)
	{
		int x1=1;
		int y1=3;
		int x2=1;
		int y2=3;
	
		double length1=Math.sqrt((x2-x1)*(x2-x1));
		double length2=Math.sqrt((y2-y1)*(y2-y1)); 
		
		
		String obj1 = String.valueOf(length1);
		String obj2 = String.valueOf(length2);
		
                              if (obj1.equals(obj2))
                                        
                              {
                                System.out.println("Two lines are same");
                               }
                             else
                                {
                                   System.out.println("Two lines are not same");
                                }		
	}
}         