package ss16_IOFile.ReadFileCSV;

public class Nation {
    int id;
    String tempNation;
    String nation;

    public Nation() {
    }

    public Nation(int id, String tempNation, String nation) {
        this.id = id;
        this.tempNation = tempNation;
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTempNation() {
        return tempNation;
    }

    public void setTempNation(String tempNation) {
        this.tempNation = tempNation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", tempNation='" + tempNation + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
