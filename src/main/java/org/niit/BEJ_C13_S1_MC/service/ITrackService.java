package org.niit.BEJ_C13_S1_MC.service;

import org.niit.BEJ_C13_S1_MC.domain.Track;

import java.util.List;

public interface ITrackService {

    Track addTrack(Track track);

    List<Track> getAllTracks();

    boolean deleteTrackByTrackId(int trackId);

    List<Track> getTrackByTrackId(int trackId);

    List<Track> getTrackByTrackArtist(String trackArtist);

    Track updateTrack(Track track,int trackId);
}
