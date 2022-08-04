package lesson17.homework.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 18:07
 * @Description:
 */

public class Champion {
    private int num;
    private int year;
    private String location;
    private String champion;

    public Champion() {
    }

    public Champion(int num, int year, String location, String champion) {
        this.num = num;
        this.year = year;
        this.location = location;
        this.champion = champion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "num=" + num +
                ", year=" + year +
                ", location='" + location + '\'' +
                ", champion='" + champion + '\'' +
                '}';
    }
}