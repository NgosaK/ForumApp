package za.ac.tpProject.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.tpProject.App;
import za.ac.tpProject.Domain.Forum;

/**
 * Created by ngosa on 18/01/2016.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ForumCrudTest extends AbstractTestNGSpringContextTests {

    private  long id;

    @Autowired
    private ForumRepository repository;

    @Test
    public void testCreate() throws Exception{

        Forum forum= new Forum.Builder().setId(15).setName("happy").
                build();
        repository.save(forum);
        id=forum.getId();
        Assert.assertNotNull(forum.getId());
    }

    @Test
    public void testRead() throws Exception{

        Forum forum= repository.findById((long) 15);
        Assert.assertEquals("happy",forum.getName());
    }

    @Test
    public void testUpdate() throws  Exception{

        Forum forum= repository.findById(id);
        Forum newForum= new Forum.Builder().setId(15).setName("bbb").
                build();
        repository.save(newForum);
        Assert.assertEquals("bbb",forum.getName());
    }

    @Test
    public void testDelete() throws Exception
    {
        Forum forum= repository.findById(id);
        repository.delete(forum);
        Forum newForum= repository.findById(id);
        Assert.assertNull(forum);

    }
}
