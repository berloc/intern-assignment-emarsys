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
        y.setDependency(z);
        z.setDependency(x);



        List<City> cities = new ArrayList<>();
        cities.add(z);
        cities.add(y);
        cities.add(x);

        City.travel(cities);
        System.out.println(City.travel(cities));

    }

}
