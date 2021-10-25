package com.example.musicdb.service;

import com.example.musicdb.model.entity.Artist;
import com.example.musicdb.model.entity.enums.NameSingerEnum;

public interface ArtistService {
    void initArtists();

    Artist findByName(NameSingerEnum artist);
}
