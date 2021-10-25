package com.example.musicdb.model.entity;

import com.example.musicdb.model.entity.enums.NameSingerEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "artists")
public class Artist extends BaseEntity {
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NameSingerEnum name;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String carrierInformation;

    @OneToMany(mappedBy = "artist",fetch = FetchType.EAGER)
    private Set<Album> albums;

    public Artist() {
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public Artist setAlbums(Set<Album> albums) {
        this.albums = albums;
        return this;
    }

    public NameSingerEnum getName() {
        return name;
    }

    public Artist setName(NameSingerEnum name) {
        this.name = name;
        return this;
    }

    public String getCarrierInformation() {
        return carrierInformation;
    }

    public Artist setCarrierInformation(String carrierInformation) {
        this.carrierInformation = carrierInformation;
        return this;
    }
}
