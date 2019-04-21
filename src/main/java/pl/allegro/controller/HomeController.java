package pl.allegro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {


    @RequestMapping("/mozaika")
    public String passingUrls(Model model, @RequestParam List<String> zdjecia,
                              @RequestParam Optional<Integer> losowo,
                              @RequestParam Optional<String> rozdzielczosc) {


        if (losowo.isPresent() && losowo.get().equals(1)) {
            Collections.shuffle(zdjecia);
        }
        model.addAttribute("zdjecia", zdjecia);
        model.addAttribute("losowo", losowo);


        if (rozdzielczosc.isPresent() && rozdzielczosc.get().length() >= 7 && rozdzielczosc.get().length() <= 9) {
            String[] splittedParts = rozdzielczosc.get().split("x");
            String width = splittedParts[0];
            String height = splittedParts[1];
            model.addAttribute("width", width);
            model.addAttribute("height", height);
        } else {
            model.addAttribute("width", "2048");
            model.addAttribute("height", "2048");
        }


        return "homepage";
    }


}
