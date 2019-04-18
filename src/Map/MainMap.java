package Map;

public class MainMap {

    static MapTile n1 = new MapTile(1, "start");
    static MapTile n0 = new MapTile(0, "sciana");
    static MapTile n2 = new MapTile(2, "mozna chodzic");
    static MapTile n3 = new MapTile(3, "meta");

    public static MapTile[][] getGlownaMapa() {
        return glownaMapa;
    }

    static MapTile [][] glownaMapa = new MapTile[][]{
            //x kolumny y wiersze

            { n0, n0, n0, n0, n3, n0, n0, n0, n0, n0 },
            { n0, n2, n2, n2, n2, n2, n2, n2, n2, n0 },
            { n0, n2, n2, n2, n2, n2, n2, n2, n2, n0 },
            { n0, n2, n2, n2, n2, n2, n2, n2, n2, n0 },
            { n0, n0, n0, n0, n1, n0, n0, n0, n0, n0 }
    };

    public MapTile currentTile (int x, int y) {
        return glownaMapa[x][y];
    }

    void description(MapTile currentTile){
        System.out.println(currentTile.getDescription());
    }

}
