package bg.softUni.mobilelele.web;

import bg.softUni.mobilelele.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OffersAddController {

    private final OfferService offerService;

    public OffersAddController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/offers/add")
    public String addOffer() {
        return "offer-add";
    }
}
