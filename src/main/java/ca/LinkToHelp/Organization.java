package ca.LinkToHelp;

public class Organization {
    private String name;
    private Double latitude;
    private Double longitude;
    private String type;

    public Organization(String name, Double latitude, Double longitude, String type) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}

