package test.assignment.dup;

import java.util.Arrays;

import com.assignment.dup.OrderedDuplicateRemovalOperation;
import com.assignment.dup.SimpleDuplicateRemovalOperation;
import com.assignment.dup.SortedDuplicateRemovalOperation;

import junit.framework.TestCase;
/**
 * Junit test cases for Simple, Ordered, Sorted duplicate removal classes
 * @author Makeshkumar Subramaniam
 *
 */
public class DuplicateRemovalTest extends TestCase {

	/**
	 * Tests the simple duplicate removal
	 *
	 */
	public void testSimpleDuplicate() {
		
		int[] data =  new int[]{2,2,1,3,4,3,1,4};
		int[] dataResult = new int[]{1,2,3,4};
		
		int[] dataDupRmd = new SimpleDuplicateRemovalOperation().removeDuplicate(data);
		
		Arrays.sort(dataDupRmd);
		
		assertEquals(dataResult.length, dataDupRmd.length);
		
		for(int i = 0 ; i < dataResult.length; i++){
			assertEquals(dataResult[i], dataDupRmd[i]);
		}
		

	}

	/**
	 * Tests the ordered duplicate removal
	 *
	 */
	public void testOrderdDuplicate() {
		
		int[] data =  new int[]{2,2,1,3,4,3,1,4};
		int[] dataResult = new int[]{2,1,3,4};
		
		int[] dataDupRmd = new OrderedDuplicateRemovalOperation().removeDuplicate(data);
		
		assertEquals(dataResult.length, dataDupRmd.length);
		
		for(int i = 0 ; i < dataResult.length; i++){
			assertEquals(dataResult[i], dataDupRmd[i]);
		}
		
	}
	
	/**
	 * Tests the sorted duplicate removal
	 *
	 */
	public void testSortedDuplicate(){
		int[] data =  new int[]{2,2,1,3,4,3,1,4};
		int[] dataResult = new int[]{1,2,3,4};
		
		int[] dataDupRmd = new SortedDuplicateRemovalOperation().removeDuplicate(data);
		
		assertEquals(dataResult.length, dataDupRmd.length);
		
		for(int i = 0 ; i < dataResult.length; i++){
			assertEquals(dataResult[i], dataDupRmd[i]);
		}
	}

}
