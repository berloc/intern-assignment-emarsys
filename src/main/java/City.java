public class City extends CityComparator {

    private String name;
    private City relation;


    public City(String name) {
        this.name = name;
    }

    public City(String name, City relation) {
        this.name = name;
        this.relation = relation;
    }

    public City getRelation() {
        return relation;
    }

    public void setRelation(City relation) {
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
