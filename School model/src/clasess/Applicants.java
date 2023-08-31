package clasess;

public class Applicants {
    private String name;
    private String address;
    private int score;

    public Applicants(String name, String address, int score) {
        this.name = name;
        this.address = address;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "clasess.Applicants{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", score=" + score +
                '}';
    }
}
