package amazon.cloudshape.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import static org.junit.Assert.fail;

public class BadTest {

    @Test
    public void meant_to_fail() throws Exception {
        assertEquals(1,1);
    }
}
