package fstday1;

public class Activity2 {

	public static void main(String[] args) {
		
		int a[]= {10, 77, 10, 54, -11, 10, 77, 54};
		
		//Element to find in the array
		int find_element=54;
		
		//Maximum sum allowed
//		int fixedsum=30;
		
		//Variable to store the sum of elements
		int temp_sum=0;
		
		//Boolean flag to track whether the target element is found
		boolean found = false;
		
		for (int number : a) 
		{
            //Check if the current element is equal to the target element
            if (number == find_element)
            {
                //Add them which is repeated 
              temp_sum += find_element;
              found = true;
              
            }

/*        if (temp_sum > fixedsum)
            {
            	break;
            }
*/        }

        System.out.println(temp_sum);
    }	
	
}

