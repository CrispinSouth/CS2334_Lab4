/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException {
    		Animal animal = new Animal("Blue", "fish", 1.1, 5.0);
    		
    		String expectedName = "fish";
    		String expectedColor = "Blue";
    		
    		Assert.assertTrue(expectedColor.equals("Blue"));
    		Assert.assertTrue(expectedName.equals("fish"));
    		Assert.assertEquals(1.1, animal.getWeight());
    		Assert.assertEquals(5.0, animal.getHeight());
    }
    
    public void getColorTest() throws AssertException {
    		String expected = "Blue";
    		Animal animal = new Animal("Blue", "fish", 1.1, 5.0);
    		
    		String actual = animal.getColor();
    		Assert.assertTrue(expected.equals(actual));
    }
    
    public void getNameTest() throws AssertException {
    		String expected = "fish";
    		Animal animal = new Animal("Blue", "fish", 1.1, 5.0);
    		
    		String actual = animal.getName();
    		Assert.assertTrue(expected.equals(actual));
    }
    
    public void getWeightTest() throws AssertException {
    		double expected = 1.1;
    		Animal animal = new Animal("Blue", "fish", 1.1, 5.0);
    		
    		double actual = animal.getWeight();
    		Assert.assertEquals(expected, actual);
    }
    
    public void getHeightTest() throws AssertException {
    		double expected = 5.0;
    		Animal animal = new Animal("Blue", "fish", 1.1, 5.0);
    		
    		double actual = animal.getHeight();
    		Assert.assertEquals(expected, actual);
    }
    
    public void toStringTest() throws AssertException {
    		String expected = "fish, a Blue-colored animal. 1.1 pounds, 5.0 inches\\\\n\\";
    		Animal animal = new Animal("Blue", "fish", 1.1, 5.0);
    		
    		String actual = animal.toString();
    		Assert.assertTrue(expected.equals(actual));
    }
}
