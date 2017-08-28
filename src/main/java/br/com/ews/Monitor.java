package br.com.ews;

/**
 * Created by wallace on 28/08/17.
 */
public class Monitor {

    private String toke;
    private String button;
    private Boolean auto = Boolean.FALSE;

    public Monitor(String toke, String button, Boolean auto) {
        this.toke = toke;
        this.button = button;
        this.auto = auto;
    }

    public String getButton() {
        System.out.println("Monitor.getButton");
        return "TAG" + button + "TAG verbose temp";
    }

    public void setButton(String button) {
        System.out.println("Monitor.setButton");
        this.button = button;
    }

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "toke='" + toke + '\'' +
                ", button='" + button + '\'' +
                ", auto=" + auto +
                '}';
    }
}
