package sg.edu.rp.c346.contactlistview;

/**
 * Created by 17010144 on 24/7/2018.
 */

public class Contacts {
    private String name;
    private int CountryCode;
    private int phoneNum;

    public Contacts(String name, int countryCode, int phoneNum) {
        this.name = name;
        CountryCode = countryCode;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int countryCode) {
        CountryCode = countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", CountryCode=" + CountryCode +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
