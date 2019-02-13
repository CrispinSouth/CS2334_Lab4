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
    
    public void getColorTest() throws assertException {
    		String expected = "Blue";
    }
    
    public void getNameTest() throws assertException {
    		String expected = "fish";
    }
    
    public void getWeightTest() throws assertException {
    		double expected = 1.1;
    }
    
    public void getHeightTest() throws assertException {
    		double expected = 5.0;
    }
}
