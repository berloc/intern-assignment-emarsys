import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Planner {

    Planner() {
    }

    List<String> plan(List<City> cities) {
        Collections.sort(cities, new CityComparator());
        List<String> sortedCities = new ArrayList<>();
        for (City city: cities) {
            sortedCities.add(city.getName());
        }
        return sortedCities;
    }
}
