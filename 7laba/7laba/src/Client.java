/**
 * Created by Masha on 11.10.2015.
 */
public class Client {
    private String fam;
    private String name;
    private String disease;
    private String date;

    public Client(String fam, String name, String disease, String date) {
        this.fam = fam;
        this.name = name;
        this.disease = disease;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fam='" + fam + '\'' +
                ", name='" + name + '\'' +
                ", disease='" + disease + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client klient = (Client) o;

        if (!getFam().equals(klient.getFam())) return false;
        if (!getName().equals(klient.getName())) return false;
        if (!getDisease().equals(klient.getDisease())) return false;
        return getDate().equals(klient.getDate());

    }

    @Override
    public int hashCode() {
        int result = getFam().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDisease().hashCode();
        result = 31 * result + getDate().hashCode();
        return result;
    }

    public Client() {
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
