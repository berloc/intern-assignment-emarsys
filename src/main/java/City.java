public class City extends CityComparator{

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
    }

}
