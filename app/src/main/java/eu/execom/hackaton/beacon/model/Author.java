package eu.execom.hackaton.beacon.model;

/**
 * Created by Blaz on 27.11.2015.
 */
public class Author {

    private Integer idAuthor;

    private String name;

    private String lastName;

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
