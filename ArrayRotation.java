                                                                                                                                                                                                                                                nums.add(number);                                                                                                                                                                                                                                                                                                                                                           }                                                                                                                                                                                                                                                                                                                                                                                                             for( i = 0 ; i < N ; i++)                                                                                                                                                                                                                                                                                                                                                   {                                                                                                                                                                                                                                                                                                                                                                                   int num = nums.get(i);                                                                                                                                                                                                                                                                                                                                                      nums.add(num);                                                                                                                                                                                                                                                                                                                                                      }                                                                                                                                                                                                                                                                                                                                                                                                                                             System.out.println("Enter k"); //                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       int k = obj.nextInt();                                                                                                                                                                                                                                                                                                                                              List<Integer> rotated_arr = Arrays.asList();                                                                                                                                                                                                                                                                                                                        for(i = k ; i<k+nums.size();i++)                                                                                                                                                                                                                                                                                                                                            {                                                                                                                                                                                                                                                                                                                                                                                   rotated_arr.add(nums.get(i));                                                                                                                                                                                                                                                                                                                                       }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               System.out.println(rotated_arr);                                                                                                                                 
import java.util.*;

public class ArrayRotation {

	public static void main(String args[])
	{
		
		
		Scanner obj = new Scanner(System.in);
		
		int i,j;
		List<Integer> nums = Arrays.asList();
		
		System.out.print("Enter array size");
		
		int N = obj.nextInt();
			
		for( i = 0 ; i < N ; i++)
			{
				int number = obj.nextInt();
				nums.add(number);
			}
		
		for( i = 0 ; i < N ; i++)
		{
			int num = nums.get(i);
			nums.add(num);
		}
		
		System.out.println("Enter k"); // 
		
		int k = obj.nextInt();
		List<Integer> rotated_arr = Arrays.asList();
		for(i = k ; i<k+nums.size();i++)
		{
			rotated_arr.add(nums.get(i));
		}
		
		System.out.println(rotated_arr);
	}
}
                                                                                                                  