import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * @Author jiangzhou
 * @Data 2022-05-22
 */
public class CreateThreadTest {

    @InjectMocks
    CreateThread createThread;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreate() {
        createThread.create();
    }
}
