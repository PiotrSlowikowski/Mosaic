package pl.allegro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    @RequestMapping("/")
    public String passingUrls(Model model, @RequestParam List<String> zdjecia,
                              @RequestParam Optional<String> losowo,
                              @RequestParam Optional<String> rozdzielczosc) {

        if (losowo.get().equals("1")) {
            Collections.shuffle(zdjecia);
        }
        model.addAttribute("zdjecia", zdjecia);
        model.addAttribute("losowo", losowo);

        if (rozdzielczosc.isPresent()) {
            model.addAttribute("rozdzielczosc", rozdzielczosc.get());
        } else {
            model.addAttribute("rozdzielczosc", rozdzielczosc.orElse("2048"));
        }

        return "homepage";
    }

}
