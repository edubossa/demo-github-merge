package br.com.ews;

/**
 * Created by wallace on 28/08/17.
 */
public class Monitor {

    private String button;
    private Boolean auto = Boolean.FALSE;

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
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
                "button='" + button + '\'' +
                ", auto=" + auto +
                '}';
    }
}
