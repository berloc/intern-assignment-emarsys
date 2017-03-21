import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlannerTest {

    private Planner planner;
    private City u,v,w,x,y,z;
    private List<City> cities;
    private List<String> testList;

    @Before
    public void setUp() throws Exception {
        planner = new Planner();
        cities = new ArrayList<>();
        u = new City("u");
        z = new City("z");
        w = new City("w");
        v = new City("v");
        x = new City("x");
        y = new City("y");
    }

    @After
    public void tearDown() throws Exception {
        planner = null;
        cities = null;
        testList = null;
    }

    @Test
    public void oneCityTest() {
        cities.add(x);
        assertEquals("x", planner.plan(cities).get(0));
    }

    @Test
    public void threeCitiesWithoutRelationsTest() {
        cities.add(x);
        cities.add(y);
        cities.add(z);
        testList = Arrays.asList(x.getName(), y.getName(), z.getName());
        assertEquals(testList, planner.plan(cities));
    }

    @Test
    public void threeCitiesWithRelationsTest() {
        cities.add(x);
        cities.add(y);
        cities.add(z);
        z.setRelation(y);
        testList = Arrays.asList(x.getName(), z.getName(), y.getName());
        assertEquals(testList, planner.plan(cities));
    }
}