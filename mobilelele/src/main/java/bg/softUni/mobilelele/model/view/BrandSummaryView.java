package bg.softUni.mobilelele.model.view;

import bg.softUni.mobilelele.model.entity.ModelEntity;

import java.util.List;

public class BrandSummaryView {

    private String name;
    private List<ModelEntity> models;

    public String getName() {
        return name;
    }

    public BrandSummaryView setName(String name) {
        this.name = name;
        return this;
    }

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandSummaryView setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }
}
