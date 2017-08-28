package br.com.ews;

/**
 * Created by wallace on 28/08/17.
 */
public class Desk {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "token='" + token + '\'' +
                '}';
    }
}
