package za.ac.tpProject.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.tpProject.App;
import za.ac.tpProject.Domain.Extra;

/**
 * Created by ngosa on 18/01/2016.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudExtra  extends AbstractTestNGSpringContextTests {

    private  long id;

    @Autowired
    private ExtraRepository repository;

    @Test
    public void testCreate() throws Exception{

        Extra extra= new Extra.Builder().setId(15).setMood("happy").
                setRefUserId(321).setSignature( "mmm").setStatus("whispers")
                .build();
        repository.save(extra);
        id=extra.getId();
        Assert.assertNotNull(extra.getId());
    }

    @Test
    public void testRead() throws Exception{

        Extra extra= repository.findById((long) 15);
        Assert.assertEquals("happy",extra.getMood());
    }

    @Test
    public void testUpdate() throws  Exception{

        Extra extra= repository.findById(id);
        Extra newExtra= new Extra.Builder().setId(15).setMood("happy").
                setRefUserId(321).setSignature( "bbb").setStatus("whispers")
                .build();
        repository.save(newExtra);
        Assert.assertEquals("bbb",extra.getSignature());
    }

    @Test
    public void testDelete() throws Exception
    {
        Extra extra= repository.findById(id);
        repository.delete(extra);
        Extra newExtra= repository.findById(id);
        Assert.assertNull(extra);

    }

}
