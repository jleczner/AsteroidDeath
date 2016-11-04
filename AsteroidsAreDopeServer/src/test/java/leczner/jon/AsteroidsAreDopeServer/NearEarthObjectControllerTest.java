package leczner.jon.AsteroidsAreDopeServer;

import leczner.jon.AsteroidsAreDopeServer.controller.NearEarthObjectController;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jonathanleczner on 11/4/16.
 */
public class NearEarthObjectControllerTest {

    @InjectMocks
    private NearEarthObjectController neoCtrl;

    @Mock
    private NearEarthObjectRepository repo;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void neoGetTest() {
        NearEarthObject neo = new NearEarthObject();
        neo.setId(3726710L);
        when(repo.findOne(3726710L)).thenReturn(neo);
        NearEarthObject nearEarthObject = neoCtrl.get(3726710L);
        verify(repo).findOne(3726710L);
//        assertEquals(3726710L, nearEarthObject.getId().longValue());
        assertThat(neo.getId(), is(3726710L));
    }
}
