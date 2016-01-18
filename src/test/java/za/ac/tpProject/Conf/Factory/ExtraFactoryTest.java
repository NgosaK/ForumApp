package za.ac.tpProject.Conf.Factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.tpProject.Domain.Extra;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ngosa on 18/01/2016.
 */
public class ExtraFactoryTest {

    @Test
    public void testCreateExtra() throws Exception {

        Map<String,String> values= new HashMap<String,String>();

        values.put("status","ghgh");
        values.put("mood","sad");
        values.put("signature","boom");

        Extra extra= ExtraFactory.createExtra(values,123,321);

        Assert.assertEquals(123,extra.getId());

    }
}