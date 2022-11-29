package org.niit.BEJ_C13_S1_MC.controller;

import org.niit.BEJ_C13_S1_MC.domain.Track;
import org.niit.BEJ_C13_S1_MC.service.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class TrackController {
    private ITrackService trackService;
    @Autowired
    public TrackController(ITrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping(value = "/track")
    public ResponseEntity<?> addTrack(@RequestBody Track track){
        return new ResponseEntity<>(trackService.addTrack(track), HttpStatus.CREATED);
    }
    @GetMapping(value = "/tracks")
    public ResponseEntity<?> getAllTracks(){
        return new ResponseEntity<>(trackService.getAllTracks(),HttpStatus.OK);
    }
    @DeleteMapping(value = "/track/{trackId}")
    public ResponseEntity<?> deleteTrack(@PathVariable int trackId){
        return new ResponseEntity<>(trackService.deleteTrackByTrackId(trackId),HttpStatus.OK);
    }
    @GetMapping(value = "/track/{trackId}")
    public ResponseEntity<?> getTrackByTrackId(@PathVariable int trackId){
        return new ResponseEntity<>(trackService.getTrackByTrackId(trackId),HttpStatus.OK);
    }
    @GetMapping(value = "/tracks/{trackArtist}")
    public ResponseEntity<?> getTrackByTrackArtist(@PathVariable String trackArtist){
        return new ResponseEntity<>(trackService.getTrackByTrackArtist(trackArtist),HttpStatus.OK);
    }
    @PutMapping(value = "/track/{trackId}")
    public ResponseEntity<?> updateTrack(@RequestBody Track track,@PathVariable int trackId){
        return new ResponseEntity<>(trackService.updateTrack(track,trackId),HttpStatus.OK);
    }
}
