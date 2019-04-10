package Map;

public class Map {

    MapTile n1 = new MapTile(1, "start");
    MapTile n0 = new MapTile(0, "sciana");
    MapTile n2 = new MapTile(2, "mozna chodzic");
    MapTile n3 = new MapTile(3, "meta");

    MapTile [][] glownaMapa = new MapTile[][]{
            { n0, n0, n0, n0, n3, n0, n0, n0, n0, n0 },
            { n0, n2, n2, n2, n2, n2, n2, n2, n2, n0 },
            { n0, n2, n2, n2, n2, n2, n2, n2, n2, n0 },
            { n0, n2, n2, n2, n2, n2, n2, n2, n2, n0 },
            { n0, n0, n0, n0, n1, n0, n0, n0, n0, n0 }
    };

    public MapTile initialPosition (){
        return n1;
    }

}
