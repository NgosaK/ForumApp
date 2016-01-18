package za.ac.tpProject.Conf.Factory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.tpProject.Domain.Users;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class UsersFactoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCreateBeverage() throws Exception {

        Map<String,String> values= new HashMap<String,String>();

        values.put("name","bob");
        values.put("username","bob");
        values.put("password","bob");


        Users users= UsersFactory.createBeverage(values,123,321);

        Assert.assertEquals(123,users.getId());

    }
}