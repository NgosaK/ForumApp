package za.ac.tpProject.Conf.Factory;

import org.jboss.logging.annotations.Pos;
import org.junit.Assert;
import org.junit.Test;
import za.ac.tpProject.Domain.Post;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class PostFactoryTest {

    @Test
    public void testCreateBeverage() throws Exception {

        Map<String,String> values= new HashMap<String,String>();

        values.put("text","bob");
        values.put("title","pop");

        Post extra= PostFactory.createBeverage(values,123,321,43);

        Assert.assertEquals(123,extra.getId());

    }
}