package Map;

public class MapTile {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int id;
    private String description;

    public MapTile(int id, String description) {
        this.id = id;
        this.description = description;
    }

}
