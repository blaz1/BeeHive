package eu.execom.hackaton.beacon.model;

/**
 * Created by Blaz on 27.11.2015.
 */
public class Beacon {
    private Integer idBeacon;

    private String macAdress;

    private Section section;

    public Integer getIdBeacon() {
        return idBeacon;
    }

    public void setIdBeacon(Integer idBeacon) {
        this.idBeacon = idBeacon;
    }

    public String getMacAdress() {
        return macAdress;
    }

    public void setMacAdress(String macAdress) {
        this.macAdress = macAdress;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
