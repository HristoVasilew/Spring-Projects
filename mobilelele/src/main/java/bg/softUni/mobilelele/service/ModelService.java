package bg.softUni.mobilelele.service;

import bg.softUni.mobilelele.model.entity.ModelEntity;

public interface ModelService {

    void initializeModels();

    ModelEntity findById(Long id);
}
