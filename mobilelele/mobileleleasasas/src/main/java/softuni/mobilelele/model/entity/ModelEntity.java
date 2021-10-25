package softuni.mobilelele.model.entity;

import softuni.mobilelele.model.entity.enums.CategoryM;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryM category;
    @Column(nullable = false)
    private String imgUlr;
    @Column(nullable = false)
    private Integer startYear;

    private Integer endYear;

    @ManyToOne
    private BrandEntity brand;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public CategoryM getCategory() {
        return category;
    }

    public ModelEntity setCategory(CategoryM category) {
        this.category = category;
        return this;
    }

    public String getImgUlr() {
        return imgUlr;
    }

    public ModelEntity setImgUlr(String imgUlr) {
        this.imgUlr = imgUlr;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public ModelEntity setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public ModelEntity setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public ModelEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }

    @PrePersist
    public void beforeCreate() {
        setCreated(Instant.now());
    }
}
