package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysList {
	public static void main(String[] args){
		
			//create a new ArrayList
					List<String> list = new ArrayList<String>();
			//add() several elements
					list.add("kebab");
					list.add("falafel");
					list.add("pastry");
			//print out the entire ArrayList
					System.out.println(list);
			//iterate through the ArrayList and print out each element
					for (int i = 0; i < list.size(); i++) {
					    System.out.println(list.get(i));
					}
			//get() specific elements
					System.out.println(list.get(0));
			//set() different elements
					list.set(0, "chicken kebab with naan");
					System.out.println(list);
			//remove() elements
					list.remove(2);
					System.out.println(list);
			//sort() the ArrayList (try this with several object types)
					List<Integer> faveNums = new ArrayList<>();

			        faveNums.add(10);
			        faveNums.add(1355417);
			        faveNums.add(63);

			        Collections.sort(faveNums);

			        for (int i : faveNums) {
			            System.out.println(i);
			        }
			//sort() the ArrayList (try this with several object types)
			        List<Integer> percentageGrade = new ArrayList<>();
			        percentageGrade.add(40);
			        percentageGrade.add(60);
			        percentageGrade.add(80);
			        Collections.sort(percentageGrade);
			        
			        for (int a : percentageGrade) {
			            System.out.println(a);
			        }
			//using the reverse(), swap() and clear() methods.
			      
				}
	
			}

	
