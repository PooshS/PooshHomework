package model;

public class Address {

    private String city;
    private String string;
    private String num;

    private String lat;
    private String lon;

    public Address() {
    }

    public Address(String city, String string, String num) {
        this.city = city;
        this.string = string;
        this.num = num;
    }

    public Address(String lat, String lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Address(String city, String string, String num, String lat, String lon) {
        this.city = city;
        this.string = string;
        this.num = num;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (string != null ? !string.equals(address.string) : address.string != null) return false;
        if (num != null ? !num.equals(address.num) : address.num != null) return false;
        if (lat != null ? !lat.equals(address.lat) : address.lat != null) return false;
        return lon != null ? lon.equals(address.lon) : address.lon == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (string != null ? string.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", string='" + string + '\'' +
                ", num='" + num + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}
