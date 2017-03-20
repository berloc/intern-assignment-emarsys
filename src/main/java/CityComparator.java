
import java.util.Comparator;


class CityComparator implements Comparator<City> {

    @Override
    public int compare(City city1, City city2) {
        System.out.println(city1.getName() + city2.getName());
        if (city1.getDependency() != null || city2.getDependency() != null) {
            if (city1.getDependency() != null && city1.getDependency().getName().equals(city2.getName())) {
                return 1;
            } else if (city2.getDependency() != null && city2.getDependency().getName().equals(city1.getName())) {
                return -1;
            }
        }
        return 0;
    }
}