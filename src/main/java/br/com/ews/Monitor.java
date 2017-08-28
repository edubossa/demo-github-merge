package br.com.ews;

/**
 * Created by wallace on 28/08/17.
 */
public class Monitor {

    private String toke;
    private String button;
    private Boolean auto = Boolean.FALSE;

    public Monitor(String toke, String button, Boolean auto) {
        System.out.println("Monitor.Monitor");
        this.toke = toke;
        this.button = button;
        this.auto = auto;
    }

    public String getButton() {
        System.out.println("Monitor.getButton EWS");
        return "TAG" + button + "TAG 099";
    }

    public void setButton(String button) {
        this.button = button;
    }

    public Boolean getAuto() {
        System.out.println("Monitor.getAuto");
        return auto;
    }

    public void setAuto(Boolean auto) {
        System.out.println("Monitor.setAuto");
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
