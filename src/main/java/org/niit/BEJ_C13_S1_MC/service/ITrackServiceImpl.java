package org.niit.BEJ_C13_S1_MC.service;

import org.niit.BEJ_C13_S1_MC.domain.Track;
import org.niit.BEJ_C13_S1_MC.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ITrackServiceImpl implements ITrackService{
     @Autowired
    private  TrackRepository trackRepository;

    public ITrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track addTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public boolean deleteTrackByTrackId(int trackId) {
        trackRepository.deleteById(trackId);
        return true;
    }

    @Override
    public List<Track> getTrackByTrackId(int trackId) {
        return trackRepository.findByTrackId(trackId);
    }

    @Override
    public List<Track> getTrackByTrackArtist(String trackArtist) {
        return trackRepository.findByTrackArtist(trackArtist);
    }

    @Override
    public Track updateTrack(Track track, int trackId)
    {
        Optional<Track> optionalTrack = trackRepository.findById(trackId);
        if(optionalTrack.isEmpty()){
            return null;
        }
        Track track1 = optionalTrack.get();
        if(track.getTrackName()!=null){
            track1.setTrackName(track.getTrackName());
        }
        if(track.getTrackComments()!=null){
            track1.setTrackComments(track.getTrackComments());
        }
        if(track.getTrackRating()!=-1){
            track1.setTrackRating(track.getTrackRating());
        }
        if(track.getTrackArtist()!=null){
            track1.setTrackArtist(track.getTrackArtist());
        }

        return trackRepository.save(track1);
    }
}
