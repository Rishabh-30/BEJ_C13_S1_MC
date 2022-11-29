package org.niit.BEJ_C13_S1_MC.repository;

import org.niit.BEJ_C13_S1_MC.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
    List<Track> findByTrackId(int trackId);

    List<Track> findByTrackArtist(String trackArtist);
}
