package bbejeck.guava.chapter2.objects;

import com.google.common.base.MoreObjects;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.google.common.base.Objects.*;
/**
 * User: Bill Bejeck
 * Date: 3/29/13
 * Time: 8:33 PM
 */
public class ObjectsTest {

    @Test
    public void testFirstNonNullBothNotNull(){
        String value = "foo";
        String returned = MoreObjects.firstNonNull(value,"bar");
        assertThat(returned,is(value));
    }

    @Test
    public void testFirstNonNullFirstNull(){
        String value = "bar";
        String returned = MoreObjects.firstNonNull(null,value);
        assertThat(returned,is(value));
    }

    @Test
    public void testFirstNonNullSecondNull(){
        String value = "bar";
        String returned = MoreObjects.firstNonNull(value,null);
        assertThat(returned,is(value));
    }

    @Test(expected = NullPointerException.class)
    public void testBothNull(){
        //Never do this
        MoreObjects.firstNonNull(null,null);
    }
}
