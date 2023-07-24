import java.util.Arrays;

public class Farm {
    private String address;
    private String OwnerName;
    private Cow[]cows;
    private Horse[]horses;
    private Sheep[]sheep;

    public Farm(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        this.address = address;
        OwnerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    public Farm() {
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{\n" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }

}
