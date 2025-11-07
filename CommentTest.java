
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    private Comment comment;
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }
    
    public void testAuthorAndTheRating(){
        //Question 18
        assertEquals("Alice", comment.getAuthor());
        assertEquals(5, comment.getRating());
    }
    
    public void testUpvote(){
        //question 18
        comment.upvote();
        comment.upvote();
        assertEquals(2, comment.getVoteCount());
    }
    
    public void testDownote(){
        comment.downvote();
        comment.downvote();
        assertEquals(-2, comment.getVoteCount());
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}