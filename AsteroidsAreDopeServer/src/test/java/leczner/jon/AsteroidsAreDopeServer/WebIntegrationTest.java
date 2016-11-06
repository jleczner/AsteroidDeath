package leczner.jon.AsteroidsAreDopeServer;

/**
 * Created by jonathanleczner on 11/4/16.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class WebIntegrationTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @MockBean
//    private NearEarthObjectController neoCtrl;
//
//    @Before
//    public void setup() {
//        given(this.neoCtrl.get("-1"))
//                .willReturn(new NearEarthObject());
//    }
//
//    @Test
//    public void test() {
//        this.restTemplate.getForEntity("http://localhost:8080/api/v1/asteroids/{id}", String.class, "-1");
//    }
//}

//@RunWith(SpringRunner.class)
//@WebMvcTest(UserVehicleController.class)
//public class UserVehicleControllerTests {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @MockBean
//    private UserVehicleService userVehicleService;
//
//    @Test
//    public void getVehicleShouldReturnMakeAndModel() {
//        given(this.userVehicleService.getVehicleDetails("sboot"))
//                .willReturn(new VehicleDetails("Honda", "Civic"));
//
//        this.mvc.perform(get("/sboot/vehicle")
//                .accept(MediaType.TEXT_PLAIN))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Honda Civic"));
//    }
//
//}