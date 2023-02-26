package collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAssignment1 
{
	



	public static List<Integer> removeDuplicates(List<Integer> list) {
		
        //Implement your logic here and change the return statement accordingly
		
		LinkedList<Integer> uniqueElements = new LinkedList<Integer>();
		for(Integer ele: list)
        {
            if(!uniqueElements.contains(ele))
                uniqueElements.add(ele);
        }
        
	  return uniqueElements;

	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+"->");
		}
	}
}



