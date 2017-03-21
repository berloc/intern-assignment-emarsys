import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Planner {

    Planner() {
    }

    List<String> plan(List<City> cities) {
        Collections.sort(cities, new CityComparator());
        return cities.stream().map(City::getName).collect(Collectors.toList());
    }
}
