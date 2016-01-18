package za.ac.tpProject.Conf.Factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.tpProject.Domain.Forum;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class ForumFactoryTest {

    @Test
    public void testCreateForum() throws Exception {

        Map<String,String> values= new HashMap<String,String>();

        values.put("name","ghgh");


        Forum extra= ForumFactory.createForum(values,123);

        Assert.assertEquals(123,extra.getId());
    }
}