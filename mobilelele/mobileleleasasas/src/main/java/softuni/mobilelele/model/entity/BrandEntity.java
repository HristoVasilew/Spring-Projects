package softuni.mobilelele.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<ModelEntity> models;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }
}
