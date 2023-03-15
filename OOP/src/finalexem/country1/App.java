package finalexem.country1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static CoutryArrayManager countryArrayManager = new CoutryArrayManager();

    public static void main(String[] args) {
        /* TODO */
        // Viết code cho các hàm test.
        // Kết quả chạy chương trình lưu vào file <Mã số sinh viên>CountryListManager.txt và nộp cùng source code.

        CoutryArrayManager coutryArrayManager = new CoutryArrayManager(30);
        ArrayList<CountryData> countryDatas = new ArrayList<>();
        for (int i = 0; i < countryArrayManager.getLength(); i++) {
        }
    }

    public static void readArrayData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            //dataReader = new BufferedReader(new FileReader("data/nations1.csv"));
            dataReader = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                // Parse data and create CountryData objects
                CountryData newCountryData = new CountryData(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .setContinent(dataList.get(5));
                countryArrayManager.append(newCountryData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries1.csv";
        readArrayData(filePath);
    }


    public static void testOriginalData() {
        init();
        String codes = countryArrayManager.codeOfCountriesToString(countryArrayManager.getCountryDataArray(), countryArrayManager.getLength());
        System.out.print(codes);
    }


    public static void testSortIncreasingByPopulation() {
        init();
        CountryData[] countries = countryArrayManager.sortIncreasingByPopulation();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.print(codes);
    }


    public static void testSortDecreasingByPopulation() {
        init();
        CountryData[] countries = countryArrayManager.sortDecreasingByPopulation();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    public static void testSortIncreasingByArea() {
        init();
        CountryData[] countries = countryArrayManager.sortIncreasingByArea();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }


    public static void testSortDecreasingByArea() {
        init();
        CountryData[] countries = countryArrayManager.sortDecreasingByArea();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }


    public static void testSortIncreasingByGdp() {
        init();
        CountryData[] countries = countryArrayManager.sortIncreasingByGdp();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    public static void testSortDecreasingByGdp() {
        init();
        CountryData[] countries = countryArrayManager.sortDecreasingByGdp();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);

    }

    public static void testFilterContinent() {
        init();
        CountryData[] countries = countryArrayManager.filterContinent(COMMA_DELIMITER);
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    public static void testFilterMostPopulousCountries() {

    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
    }


    public static void testFilterLargestAreaCountries() {
        /* TODO */
    }


    public static void testFilterSmallestAreaCountries() {
        /* TODO */
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
    }


    public static void testFilterLowestGdpCountries() {
        /* TODO */
    }
}
