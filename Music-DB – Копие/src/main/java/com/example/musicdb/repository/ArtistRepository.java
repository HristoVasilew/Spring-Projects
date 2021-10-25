package com.example.musicdb.repository;

import com.example.musicdb.model.entity.Artist;
import com.example.musicdb.model.entity.enums.NameSingerEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {
    Optional<Artist> findByName(NameSingerEnum artist);
}
