/**
 * Created by Masha on 11.10.2015.
 */
public class Doctor {
    private String fam;
    private String name;
    private String otc;
    private String date;
    private int vdolid;
    private int specid;
    private int klavid;

    @Override
    public String toString() {
        return "Doctor{" +
                "fam='" + fam + '\'' +
                ", name='" + name + '\'' +
                ", otc='" + otc + '\'' +
                ", date='" + date + '\'' +
                ", vdolid=" + vdolid +
                ", specid=" + specid +
                ", klavid=" + klavid +
                ", stav=" + stav +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;

        Doctor doctor = (Doctor) o;

        if (getVdolid() != doctor.getVdolid()) return false;
        if (getSpecid() != doctor.getSpecid()) return false;
        if (getKlavid() != doctor.getKlavid()) return false;
        if (Float.compare(doctor.getStav(), getStav()) != 0) return false;
        if (!getFam().equals(doctor.getFam())) return false;
        if (!getName().equals(doctor.getName())) return false;
        if (!getOtc().equals(doctor.getOtc())) return false;
        return getDate().equals(doctor.getDate());

    }

    @Override
    public int hashCode() {
        int result = getFam().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getOtc().hashCode();
        result = 31 * result + getDate().hashCode();
        result = 31 * result + getVdolid();
        result = 31 * result + getSpecid();
        result = 31 * result + getKlavid();
        result = 31 * result + (getStav() != +0.0f ? Float.floatToIntBits(getStav()) : 0);
        return result;
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

    public String getOtc() {
        return otc;
    }

    public void setOtc(String otc) {
        this.otc = otc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getVdolid() {
        return vdolid;
    }

    public void setVdolid(int vdolid) {
        this.vdolid = vdolid;
    }

    public int getSpecid() {
        return specid;
    }

    public void setSpecid(int specid) {
        this.specid = specid;
    }

    public int getKlavid() {
        return klavid;
    }

    public void setKlavid(int klavid) {
        this.klavid = klavid;
    }

    public float getStav() {
        return stav;
    }

    public void setStav(float stav) {
        this.stav = stav;
    }

    public Doctor() {

    }

    public Doctor(String fam, String name, String otc, String date, int vdolid, int specid, int klavid, float stav) {

        this.fam = fam;
        this.name = name;
        this.otc = otc;
        this.date = date;
        this.vdolid = vdolid;
        this.specid = specid;
        this.klavid = klavid;
        this.stav = stav;
    }

    private float stav;

}
