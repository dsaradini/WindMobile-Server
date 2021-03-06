package ch.windmobile.server.windline.dataobject;

public class PropertyValue implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String value;
    private Property property;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
