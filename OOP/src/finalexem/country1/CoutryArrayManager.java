package finalexem.country1;

import java.util.*;

public class CoutryArrayManager {
    private CountryData[] countryDataArray;
    private int length;
    private int increment;

    public CoutryArrayManager() {
        this.increment = 10;
        countryDataArray = new CountryData[this.increment];
        this.length = 0;
    }

    public CoutryArrayManager(int maxLength) {
        this.increment = 10;
        countryDataArray = new CountryData[maxLength];
        this.length = 0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public CountryData[] getCountryDataArray() {
        return this.countryDataArray;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countryDataArray.length; i++) {
            if (this.countryDataArray[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex + 1;
            for (int i = nullFirstIndex; i < this.countryDataArray.length; i++) {
                this.countryDataArray[i] = null;
            }
        }
    }


    private void allocateMore() {
        CountryData[] newArray = new CountryData[this.length + this.increment];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.countryDataArray.length);
        this.countryDataArray = newArray;
    }


    public void append(CountryData countryData) {
        if (this.length >= this.countryDataArray.length) {
            allocateMore();
        }

        this.countryDataArray[this.length] = countryData;
        this.length++;
    }


    public void add(CountryData countryData, int index) {
        for (int i = length; i > index; i--) {
            countryDataArray[i] = countryDataArray[i - 1];
        }
        countryDataArray[index] = countryData;
        length++;
    }

    public void remove(int index) {
        for (int i = index; i < length; i++) {
            countryDataArray[i] = countryDataArray[i+1];
        }
        countryDataArray[length - 1] = null;
        this.length --;
    }

    public CountryData countryDataAt(int index) {
        return this.countryDataArray[index];
    }

    // Sắp xếp dữ liệu theo thứ tự dân số (population) tăng dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort,
    // hoặc dùng Comparable, Comparator của Java.
    public CountryData[] sortIncreasingByPopulation() {
        CountryData[] newArray = new CountryData[this.length];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.length);
        Arrays.sort(newArray, new Comparator<CountryData>() {
            @Override
            public int compare(CountryData left, CountryData right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newArray;
    }

    // Sắp xếp dữ liệu theo thứ tự dân số (population) giảm dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort,
    // hoặc dùng Comparable, Comparator của Java.
    public CountryData[] sortDecreasingByPopulation() {
        CountryData[] newArray = new CountryData[this.length];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.length);
        Arrays.sort(newArray, new Comparator<CountryData>() {
            @Override
            public int compare(CountryData left, CountryData right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newArray;
    }

    // Sắp xếp dữ liệu theo thứ tự diện tích (area) tăng dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort,
    // hoặc dùng Comparable, Comparator của Java.
    public CountryData[] sortIncreasingByArea() {
        CountryData[] newArray = new CountryData[this.length];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.length);
        Arrays.sort(newArray, new Comparator<CountryData>() {
            @Override
            public int compare(CountryData left, CountryData right) {
                return (int)(left.getArea() - right.getArea());
            }
        });
        return newArray;
    }

    // Sắp xếp dữ liệu theo thứ tự diện tích (area) giảm dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort,
    // hoặc dùng Comparable, Comparator của Java.
    public CountryData[] sortDecreasingByArea() {
        CountryData[] newArray = new CountryData[this.length];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.length);
        Arrays.sort(newArray, new Comparator<CountryData>() {
            @Override
            public int compare(CountryData left, CountryData right) {
                return (int)(right.getArea() - left.getArea());
            }
        });
        return newArray;
    }

    // Sắp xếp dữ liệu theo thứ tự gdp tăng dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort,
    // hoặc dùng Comparable, Comparator của Java.
    public CountryData[] sortIncreasingByGdp() {
        CountryData[] newArray = new CountryData[this.length];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.length);
        Arrays.sort(newArray, new Comparator<CountryData>() {
            @Override
            public int compare(CountryData left, CountryData right) {
                return (int)(left.getGdp()- right.getGdp());
            }
        });
        return newArray;
    }

    // Sắp xếp dữ liệu theo thứ tự gdp giảm dần.
    // Hàm sắp xếp không nên làm thay đổi mảng dữ liệu gốc.
    // Vì vậy cấn cấp phát một mảng mới có độ dài là length, copy dữ liệu gốc sang mảng mới,
    // sau đó sắp xếp trên mảng mới, và trả ra ngoài hàm mảng mới đã được sắp xếp.
    // Nếu cần in thông tin theo dân số tăng dần, in thông tin từ mảng dữ liệu mới này.
    // Việc sắp xếp có thể sử dụng các thuật toán sắp xếp, như sellection sort, bubble sort, insertion sort,
    // hoặc dùng Comparable, Comparator của Java.
    public CountryData[] sortDecreasingByGdp() {
        CountryData[] newArray = new CountryData[this.length];
        System.arraycopy(this.countryDataArray, 0, newArray, 0, this.length);
        Arrays.sort(newArray, new Comparator<CountryData>() {
            @Override
            public int compare(CountryData left, CountryData right) {
                return (int)(right.getGdp()- left.getGdp());
            }
        });
        return newArray;
    }

    // Lọc ra những nước ở vùng continent (ví dụ, Châu Á).
    // Duyện từ đầu mảng đến cuối mảng, xác định xem có bao nhiêu nước thuộc vùng continent,
    // cấp phát một mảng đủ để chứa dữ liệu, sau đó duyệt lại qua mảng để thêm những nước trong vùng continent
    // vào mảng mới vừa cấp phát. (Có thể làm theo cách khác).
    public CountryData[] filterContinent(String continent) {
        CountryData[] newArray = new CountryData[this.length];
        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getContinent().equals(continent)) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }
        return newArray;
    }

    // Lọc ra những nước (howMany nước) có dân số đông nhất
    // Có thể làm như sau.
    // Sắp xếp dữ liệu theo thứ tự dân số giảm dần. Cấp phát mảng mới có howMany phần tử,
    // copy howMany dữ liệu từ mảng đã sắp xếp vào mảng mới vừa cấp phát.
    // Trả ra mảng mới vừa copy.
    public CountryData[] filterMostPopulousCountries(int howMany) {
        CountryData[] newArray = new CountryData[howMany];
        int maxPopulation = this.countryDataArray[0].getPopulation();
        for (int i = 1; i < this.length; i++) {
            if (maxPopulation <= this.countryDataArray[i].getPopulation()) {
                maxPopulation = this.countryDataArray[i].getPopulation();
            }
        }

        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getPopulation() == maxPopulation) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }
        if (newArray.length == 0) {
            return null;
        }
        return newArray;
    }

    // Lọc ra howMany nước có dân số ít nhất.
    public CountryData[] filterLeastPopulousCountries(int howMany) {
        CountryData[] newArray = new CountryData[howMany];
        int minPopulation = this.countryDataArray[0].getPopulation();
        for (int i = 1; i < this.length; i++) {
            if (minPopulation >= this.countryDataArray[i].getPopulation()) {
                minPopulation = this.countryDataArray[i].getPopulation();
            }
        }

        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getPopulation() == minPopulation) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }
        if (newArray.length == 0) {
            return null;
        }
        return newArray;    }

    // Lọc ra howMany nước có diện tích lớn nhất.
    public CountryData[] filterLargestAreaCountries(int howMany) {
        CountryData[] newArray = new CountryData[howMany];
        double maxArea = this.countryDataArray[0].getArea();
        for (int i = 1; i < this.length; i++) {
            if (maxArea <= this.countryDataArray[i].getArea()) {
                maxArea = this.countryDataArray[i].getArea();
            }
        }

        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getArea() == maxArea) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }
        if (newArray.length == 0) {
            return null;
        }
        return newArray;
    }

    // Lọc ra howMany nước có diện tích nhỏ nhất.
    public CountryData[] filterSmallestAreaCountries(int howMany) {
        CountryData[] newArray = new CountryData[howMany];
        double minArea = this.countryDataArray[0].getArea();
        for (int i = 1; i < this.length; i++) {
            if (minArea >= this.countryDataArray[i].getArea()) {
                minArea = this.countryDataArray[i].getArea();
            }
        }

        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getArea()== minArea) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }
        if (newArray.length == 0) {
            return null;
        }
        return newArray;
    }

    // Lọc ra howMany nước có GDP cao nhất.
    public CountryData[] filterHighestGdpCountries(int howMany) {
        CountryData[] newArray = new CountryData[howMany];
        double maxGDP = this.countryDataArray[0].getGdp();
        for (int i = 1; i < this.length; i++) {
            if (maxGDP <= this.countryDataArray[i].getGdp()) {
                maxGDP = this.countryDataArray[i].getGdp();
            }
        }

        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getGdp()== maxGDP) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }
        if (newArray.length == 0) {
            return null;
        }
        return newArray;
    }

    // Lọc ra howMany nước có GDP thấp nhất.
    public CountryData[] filterLowestGdpCountries(int howMany) {
        CountryData[] newArray = new CountryData[howMany];
        double minGDP = this.countryDataArray[0].getGdp();
        for (int i = 1; i < this.length; i++) {
            if (minGDP >= this.countryDataArray[i].getGdp()) {
                minGDP = this.countryDataArray[i].getGdp();
            }
        }

        for (int i = 0; i < this.length; i++) {
            if (this.countryDataArray[i].getGdp()== minGDP) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = this.countryDataArray[i];
                }
            }
        }

        if (newArray.length == 0) {
            return null;
        }
        return newArray;
    }

    // Hàm lấy danh sách các nước theo code, là String có format dạng, ví dụ [USA VNM].
    public static String codeOfCountriesToString(CountryData[] countryDataArray, int length) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < length; i++) {
            CountryData countryData = countryDataArray[i];
            codeOfCountries.append(countryData.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    // In đầy đủ thông tin các nước trong một mảng, mỗi mảng in trên 1 dòng.
    // Ví dụ:
    // [CountryData[code='IND', name='India', population=1405888536, area=3287590.0, gdp=1927.7, continent='Asia']
    //  CountryData[code='PAK', name='Pakistan', population=229248330, area=881912.0, gdp=1188.9, continent='Asia']]
    // Chú ý chỉ in length phần tử đầu của mảng chứa dữ liệu, các phần tử sau có thể là null.
    public static void print(CountryData[] countryDataArray, int length) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < length; i++) {
            CountryData country = countryDataArray[i];
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
