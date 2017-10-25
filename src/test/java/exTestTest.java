import org.junit.Test;
import static org.junit.Assert.*;

public class exTestTest {

    @Test
    public void testEx30(){
        assertEquals(ex3.Tri(0),0);
    }

    @Test
    public void testEx35(){
        assertEquals(ex3.Tri(5),15);
    }

    @Test
    public void testEx37(){
        assertEquals(ex3.Tri(7), 28);
    }

    @Test
    public void testEx3zero(){
        assertEquals(ex3.Lazy(0),1);
    }

    @Test
    public void testEx3five(){
        assertEquals(ex3.Lazy(5), 16);
    }

    @Test
    public void testEx3seven(){
        assertEquals(ex3.Lazy(7), 29);
    }



}