package bg.softUni.mobilelele.service.impl;

import bg.softUni.mobilelele.model.entity.BrandEntity;
import bg.softUni.mobilelele.model.service.BrandServiceModel;
import bg.softUni.mobilelele.repository.BrandRepository;
import bg.softUni.mobilelele.service.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final ModelMapper modelMapper;

    public BrandServiceImpl(BrandRepository brandRepository, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.brandRepository = brandRepository;
    }

    @Override
    public void initializeBrand() {
        if (brandRepository.count() == 0) {
            BrandEntity ford = new BrandEntity();
            ford.setName("Ford");

            brandRepository.save(ford);
        }
    }

    @Override
    public List<BrandServiceModel> getAllBrands() {
        return brandRepository.findAll()
                .stream()
                .map(brandEntity -> modelMapper.map(brandEntity, BrandServiceModel.class))
                .collect(Collectors.toList());
    }

}