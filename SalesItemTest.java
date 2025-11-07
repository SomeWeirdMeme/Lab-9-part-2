import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    //question 15
    private SalesItem Zambony;
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Zambony = new SalesItem("Brain surgery for Dummies", 21998);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        Zambony = null;
    }
    
    public void testRateBoundary(){
        //question uhh 16
        SalesItem item = new SalesItem("bloo blaw", 1000);
        assertFalse(item.addComment("Alice", "Rating too low", 0));
        assertFalse(item.addComment("Mahik", "Rating too high bruh", 6));
    }
    
    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        //question 15
        Zambony.addComment("Mousilini","I love Controlling my people", 5);
        assertEquals(false, Zambony.addComment("Mousilini", "I love Controlling my people",5));
        assertEquals(true, Zambony.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(2, Zambony.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }
    
    public void testFindMostHelpfulComment(){
        //Question 19
        Zambony.addComment("Lebron", "WOWOWOWOOW", 5);
        Zambony.addComment("Bob", "WOWOOWOWOWOW", 4);
        
        Zambony.upvoteComment(0);
        Zambony.upvoteComment(0);
        Zambony.upvoteComment(1);
        
        Comment mostHelpful = Zambony.findMostHelpfulComment();
        
        assertEquals("Lebron", mostHelpful.getAuthor());
        assertEquals(2, mostHelpful.getVoteCount());
    }
    
    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }
}
