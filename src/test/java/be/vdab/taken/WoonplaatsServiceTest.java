package be.vdab.taken;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WoonplaatsServiceTest {

    private WoonplaatsService service;

    @BeforeEach
    void beforeEach() {
        service = new WoonplaatsService(new WoonplaatsRepositoryStub());
    }
    @Test
    void maxAantalStreepjesInEenWoonplaatsIs3() {
        assertThat(service.maxAantalStreepjesInEenWoonplaats()).isEqualTo(3L);
    }

}
