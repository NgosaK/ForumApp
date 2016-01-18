package za.ac.tpProject.Domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class ForumTest {

    Forum forum = new Forum.Builder().setId(123).setName("nop").build();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(123,forum.getId());

    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertEquals("nop",forum.getName());

    }
}