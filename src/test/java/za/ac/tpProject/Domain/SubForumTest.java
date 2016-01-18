package za.ac.tpProject.Domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class SubForumTest {

    SubForum subForum = new SubForum.Builder().setRefForum(1).setId(123).
            setName("Ji").build();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(123,subForum.getId());
    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertEquals("Ji",subForum.getName());

    }

    @Test
    public void testGetRefForum() throws Exception {
        Assert.assertEquals(1,subForum.getRefForum());

    }
}