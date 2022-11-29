package org.niit.BEJ_C13_S1_MC.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {

    @Id
    private int trackId;
    private String trackName;
    private String trackComments;
    private double trackRating;
    private String trackArtist;

    public Track() {
    }

    public Track(int trackId, String trackName, String trackComments, double trackRating, String trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public double getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(double trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                ", trackRating=" + trackRating +
                ", trackArtist='" + trackArtist + '\'' +
                '}';
    }
}
