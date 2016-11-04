package leczner.jon.AsteroidsAreDopeServer;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by jonathanleczner on 11/4/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepoIntegrationTest {
    @Autowired
    private NearEarthObjectRepository repo;

    @Test
    public void testFindAll() {
        List<NearEarthObject> NEOs = repo.findAll();
        assertThat(NEOs.size(), is(greaterThanOrEqualTo(0)));
    }
}

//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class UserRepositoryTests {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private UserRepository repository;
//
//    @Test
//    public void findByUsernameShouldReturnUser() {
//        this.entityManager.persist(new User("sboot", "123"));
//        User user = this.repository.findByUsername("sboot");
//
//        assertThat(user.getUsername()).isEqualTo("sboot");
//        assertThat(user.getVin()).isEqualTo("123");
//    }
//
//}