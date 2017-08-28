package br.com.ews;

/**
 * Created by wallace on 28/08/17.
 */
public class Office {

    private String token;
    private Desk desk;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    @Override
    public String toString() {
        return "Office{" +
                "token='" + token + '\'' +
                ", desk=" + desk +
                '}';
    }
}
