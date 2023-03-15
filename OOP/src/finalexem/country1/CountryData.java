package finalexem.country1;

public class CountryData {
    private String code;
    private String name;
    private int population;
    private double area;
    private double gdp;
    private String continent;

    public CountryData(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public double getGdp() {
        return gdp;
    }

    public String getContinent() {
        return continent;
    }

    public CountryData setName(String name) {
        this.name = name;
        return this;
    }

    public CountryData setPopulation(int population) {
        this.population = population;
        return this;
    }

    public CountryData setArea(double area) {
        this.area = area;
        return this;
    }

    public CountryData setGdp(double gdp) {
        this.gdp = gdp;
        return this;
    }

    public CountryData setContinent(String continent) {
        this.continent = continent;
        return this;
    }
    @Override
    public String toString() {
        return "CountryData[" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ", continent='" + continent + '\'' +
                ']';
    }
}
