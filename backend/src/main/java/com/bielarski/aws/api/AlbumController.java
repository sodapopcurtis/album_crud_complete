package com.bielarski.aws.api;

import com.bielarski.aws.entity.Album;
import com.bielarski.aws.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController // CONTROLLER
public class AlbumController {

    @Autowired
    private AlbumRepository repository;

    @PostMapping("/addAlbum") // Annotation for mapping HTTP POST requests onto specific handler methods
    public Album addAlbum(@RequestBody Album album) {
        return repository.addAlbum(album);
    }

    @GetMapping("/getAlbum/{albumId}") // Annotation for mapping HTTP POST requests onto specific handler methods
    public Album getAlbumById(@PathVariable String albumId) {
        return repository.findAlbumById(albumId);
    }

    @GetMapping("/getAllAlbums") // Annotation for mapping HTTP POST requests onto specific handler methods
    public List<Album> getAllAlbums() {
        return repository.findAllAlbums();
    }

    @DeleteMapping("/deleteAlbum")
    public ResponseEntity<String> deleteAlbum(@RequestBody Album album) {
        return repository.deleteAlbum(album);
    }

    @PutMapping("/updateAlbum")
    public ResponseEntity<Album> updateAlbum(@RequestBody Album album) {
        return repository.editAlbum(album);
    }

}
