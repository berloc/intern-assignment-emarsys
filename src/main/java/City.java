import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City extends CityComparator {

    private String name;
    private City dependency;


    public City(String name) {
        this.name = name;
    }

    public City(String name, City dependency) {
        this.name = name;
        this.dependency = dependency;
    }

    public City getDependency() {
        return dependency;
    }

    public void setDependency(City dependency) {
        this.dependency = dependency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static List<String> travel(List<City> cities) {
        Collections.sort(cities, new CityComparator());
        List<String> sortedCities = new ArrayList<>();
        for (City city: cities) {
            sortedCities.add(city.getName());
        }
        return sortedCities;
    }
}
