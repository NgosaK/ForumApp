package za.ac.tpProject.Domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class ExtraTest {

    Extra extra = new Extra.Builder().setId(23).setMood("Happy").
            setRefUserId(1234).setSignature("mmm").setStatus("We we we").build();


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {

        Assert.assertEquals(23,extra.getId());

    }

    @Test
    public void testGetRefUserId() throws Exception {

        Assert.assertEquals(1234,extra.getRefUserId());
    }

    @Test
    public void testGetStatus() throws Exception {
        Assert.assertEquals("We we we",extra.getStatus());

    }

    @Test
    public void testGetMood() throws Exception {
        Assert.assertEquals("Happy",extra.getMood());
    }

    @Test
    public void testGetSignature() throws Exception {
        Assert.assertEquals("mmm",extra.getSignature());

    }
}