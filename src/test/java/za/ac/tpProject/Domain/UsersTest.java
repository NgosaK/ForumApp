package za.ac.tpProject.Domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class UsersTest {

    Users users = new Users.Builder().setId(123).setName("jim").setPassword("ere").
            setUsername("erer").build();

    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(123,users.getId());
    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertEquals("jim",users.getName());
    }

    @Test
    public void testGetPassword() throws Exception {
        Assert.assertEquals("ere",users.getPassword());
    }

    @Test
    public void testGetUsername() throws Exception {
        Assert.assertEquals("erer",users.getUsername());
    }
}