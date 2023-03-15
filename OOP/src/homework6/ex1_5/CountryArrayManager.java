package homework6.ex1_5;

import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[min_idx].getPopulation()) {
                    min_idx = j;
                }
            }
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[max_idx].getPopulation()) {
                    max_idx = j;
                }
            }
            Country temp = newArray[max_idx];
            newArray[max_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getArea() < newArray[min_idx].getArea()) {
                    min_idx = j;
                }
            }
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getArea() > newArray[min_idx].getArea()) {
                    min_idx = j;
                }
            }
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getGdp() < newArray[min_idx].getGdp()) {
                    min_idx = j;
                }
            }
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getGdp() > newArray[min_idx].getGdp()) {
                    min_idx = j;
                }
            }
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[this.countries.length];
        int endIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                africaCountries[endIndex] = (AfricaCountry) countries[i];
                endIndex++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] asiaCountries = new AsiaCountry[this.countries.length];
        int endIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                asiaCountries[endIndex] = (AsiaCountry) countries[i];
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[this.countries.length];
        int endIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                europeCountries[endIndex] = (EuropeCountry) countries[i];
                endIndex++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[this.countries.length];
        int endIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                northAmericaCountries[endIndex] = (NorthAmericaCountry) countries[i];
                endIndex++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[this.countries.length];
        int endIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                oceaniaCountries[endIndex] = (OceaniaCountry) countries[i];
                endIndex++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[this.countries.length];
        int endIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                southAmericaCountries[endIndex] = (SouthAmericaCountry) countries[i];
                endIndex++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newCountries = new Country[howMany];
        Country[] sortedCountries = sortByDecreasingPopulation();

        for (int index = 0; index < howMany; index++) {
            newCountries[index] = sortedCountries[index];
        }

        return newCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newCountries = new Country[howMany];
        Country[] sortedCountries = sortByIncreasingPopulation();

        for (int index = 0; index < howMany; index++) {
            newCountries[index] = sortedCountries[index];
        }

        return newCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newCountries = new Country[howMany];
        Country[] sortedCountries = sortByDecreasingArea();

        for (int index = 0; index < howMany; index++) {
            newCountries[index] = sortedCountries[index];
        }

        return newCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newCountries = new Country[howMany];
        Country[] sortedCountries = sortByIncreasingArea();

        for (int index = 0; index < howMany; index++) {
            newCountries[index] = sortedCountries[index];
        }

        return newCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newCountries = new Country[howMany];
        Country[] sortedCountries = sortByDecreasingGdp();

        for (int index = 0; index < howMany; index++) {
            newCountries[index] = sortedCountries[index];
        }

        return newCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newCountries = new Country[howMany];
        Country[] sortedCountries = sortByIncreasingGdp();

        for (int index = 0; index < howMany; index++) {
            newCountries[index] = sortedCountries[index];
        }
        return newCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
