package bg.softUni.mobilelele.service;

import bg.softUni.mobilelele.model.service.OfferUpdateServiceModel;
import bg.softUni.mobilelele.model.view.OfferDetailsView;
import bg.softUni.mobilelele.model.view.OfferSummaryView;

import java.util.List;

public interface OfferService {
    void initializeOffers();

    List<OfferSummaryView> getAllOffers();

    OfferDetailsView findById(Long id);

    void deleteOffer(Long id);

    void updateOffer(OfferUpdateServiceModel offerModel);
}
