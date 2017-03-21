
import java.util.Comparator;


class CityComparator implements Comparator<City> {

    @Override
    public int compare(City city1, City city2) {
        try {
            if (city1.getRelation() != null && city1.getRelation().getName().equals(city2.getName())) {
                return -1;
            } else if (city2.getRelation() != null && city2.getRelation().getName().equals(city1.getName())) {
                return 1;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }
}