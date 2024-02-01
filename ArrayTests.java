import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test //tells the jUnit that this is a test and we 
  // should run it as one
	public void testReverseInPlace() { //tests if an array with 1 int in it reverses
    int[] input1 = { 3 }; //give an array with just 3 in it
    ArrayExamples.reverseInPlace(input1); //call reverseinplace
    assertArrayEquals(new int[]{ 3 }, input1); //checks if this is equal
	}


  @Test
  public void testReversed() { //tests if an empty array is reversed
    int[] input1 = { }; //give an array with nothing in it
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = new int[]{1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input1 = new int[]{1,2,3,4,5}; 
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }
}
