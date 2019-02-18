public class Serverinfo {

    private String nombre;
    private String shortName;
    private int numPlayers;
    private int maxPlayers;

    public Serverinfo() {
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return this.getNombre() + this.getShortName();
    }

}
