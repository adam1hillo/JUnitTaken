package be.vdab.taken;

import java.util.List;

class WoonplaatsService {

    private final WoonplaatsRepository repository;

    WoonplaatsService(WoonplaatsRepository repository) {
        this.repository = repository;
    }

    long maxAantalStreepjesInEenWoonplaats() {
        List<String> metStreepjes = repository.findMetStreepjes();
        return metStreepjes.stream()
                .map(woonplaats -> woonplaats.chars().filter(eenChar -> eenChar=='-').count())
                .max(Long::compareTo)
                .orElse(0L);
//                .map(woonplaats -> woonplaats.length() - woonplaats.replace("-","").length())
//                .max(Integer::compareTo)
//                .orElse(0);
    }
}
