package fr.esilv.s8.finalproject.models;

/**
 * Created by hugoalix on 22/03/2017.
 */

public class Id {
    private String kind;
    private String videoId;

    public Id(String kind, String videoId) {
        this.kind = kind;
        this.videoId = videoId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
