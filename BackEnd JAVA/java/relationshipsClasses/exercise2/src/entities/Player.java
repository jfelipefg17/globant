package entities;

public class Player {
    private int id;
    private String userID;
    private boolean wed;

    public Player () {

    }

    public Player(int id, String userID, boolean wed) {
        this.id = id;
        this.userID = userID;
        this.wed = wed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public boolean isWed() {
        return wed;
    }

    public void setWed(boolean wed) {
        this.wed = wed;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
                ", wed=" + wed +
                '}';
    }
}
