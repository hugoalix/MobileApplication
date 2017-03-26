package fr.esilv.s8.finalproject.models;

/**
 * Created by hugoalix on 21/03/2017.
 */

public class Thumbnails {

    private Default defaut;
    private Medium medium;
    private High high;

    public Thumbnails(Default defaut, Medium medium, High high) {
        this.defaut = defaut;
        this.medium = medium;
        this.high = high;
    }

    public Default getDefaut() {
        return defaut;
    }

    public void setDefaut(Default defaut) {
        this.defaut = defaut;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }
}
