package softuni.mobilelele.model.entity;

import softuni.mobilelele.model.entity.enums.Engine;
import softuni.mobilelele.model.entity.enums.Transmission;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {

    private String description;

    @Enumerated(EnumType.ORDINAL)
    private Engine engine;

    private String imgUrl;

    private Integer mileage;

    private Double price;

    @Enumerated(EnumType.ORDINAL)
    private Transmission transmission;

    private LocalDate year;

    private Instant created;

    private Instant modified;

    @OneToOne
    private ModelEntity model;

    @OneToOne
    private UserEntity seller;

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public OfferEntity setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public OfferEntity setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public OfferEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public LocalDate getYear() {
        return year;
    }

    public OfferEntity setYear(LocalDate year) {
        this.year = year;
        return this;
    }

    @Override
    public Instant getCreated() {
        return created;
    }

    @Override
    public OfferEntity setCreated(Instant created) {
        this.created = created;
        return this;
    }

    @Override
    public Instant getModified() {
        return modified;
    }

    @Override
    public OfferEntity setModified(Instant modified) {
        this.modified = modified;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public OfferEntity setSeller(UserEntity seller) {
        this.seller = seller;
        return this;
    }
}
