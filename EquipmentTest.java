
public class EquipmentTest {
	 public void ConstructorTest() throws AssertException
	    {
	        // Use the default constructor
	        Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
	        
	        //name, count, totalWeight, totalPrice, and description
	        
	        Assert.assertEquals("Cool Cool Cool", eq.getDescription());
	        Assert.assertEquals("batarang", eq.getName());
	        Assert.assertEquals(4, eq.getCount(), 0.01);
	        Assert.assertEquals(3.5, eq.getTotalWeight(), 0.01);
	        Assert.assertEquals(12.5, eq.getTotalPrice(), 0.01);
	    }
	 
	 public void getNameTest() throws AssertException {
		 String expected = "batarang";
		 Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
		 
		 String actual = eq.getName();
		 Assert.assertTrue(expected.equals(actual));
	 }
	 
	 public void getCountTest() throws AssertException {
		 int expected = 4;
		 Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
		 
		 int actual = eq.getCount();
		 Assert.assertEquals(expected, actual);
	 }
	 
	 public void getTotalWeightTest() throws AssertException {
		 double expected = 3.5;
		 Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
		 
		 double actual = eq.getTotalWeight();
		 Assert.assertEquals(expected, actual);
	 }
	 
	 public void getTotalPriceTest() throws AssertException {
		 double expected = 12.5;
		 Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
		 
		 double actual = eq.getTotalPrice();
		 Assert.assertEquals(expected, actual);
	 }
	 
	 public void getDescriptionTest() throws AssertException {
		 String expected = "Cool Cool Cool";
		 Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
		 
		 String actual = eq.getDescription();
		 Assert.assertTrue(expected.equals(actual));
	 }
	 
	 public void toStringTest() throws AssertException {
		 String expected = "Name: batarang, Number: 4, Weight: 3.5 lbs, Price: $12.5 - Cool Cool Cool";
		 Equipment eq = new Equipment("batarang/4,3.5,12.5,Cool Cool Cool");
		 
		 String actual = eq.toString();
		 Assert.assertTrue(expected.equals(actual));
	 }

}
