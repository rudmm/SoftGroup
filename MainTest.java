import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 09.03.17.
 */
public class MainTest {
    Main main = new Main();
    @Test
    public void complementary() throws Exception {
        int[] m = {1,3,4,11};
        int k = 5;
        int l = 4;
        String s = "K = a["+0+"]+a["+2+"]";
        String stest = main.complementary(m,k,l);
        Assert.assertEquals(s, stest);

    }

}