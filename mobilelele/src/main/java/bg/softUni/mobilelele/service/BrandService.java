package bg.softUni.mobilelele.service;


import bg.softUni.mobilelele.model.service.BrandServiceModel;

import java.util.List;

public interface BrandService {

    void initializeBrand();

    List<BrandServiceModel> getAllBrands();
}