import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        City u = new City("u");
        City v = new City("v");
        City w = new City("w");
        City x = new City("x");
        City y = new City("y");
        City z = new City("z");
        u.setRelation(x);
        v.setRelation(y);
        w.setRelation(v);
        z.setRelation(w);

        List<City> cities = new ArrayList<>();
        cities.add(w);
        cities.add(z);
        cities.add(y);
        cities.add(u);
        cities.add(x);
        cities.add(v);

        Planner planner = new Planner();
        System.out.println(planner.plan(cities));
    }
}
