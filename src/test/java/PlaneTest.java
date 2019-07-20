import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(467, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetWeight(){
        assertEquals(442000, plane.getPlaneType().getWeight());
    }
}
