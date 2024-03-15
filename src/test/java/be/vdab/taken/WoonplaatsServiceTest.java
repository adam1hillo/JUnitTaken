package be.vdab.taken;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WoonplaatsServiceTest {

    @Mock
    private WoonplaatsRepository repository;
    private WoonplaatsService service;

    @BeforeEach
    void beforeEach() {
        service = new WoonplaatsService(repository);
    }
    @Test
    void maxAantalStreepjesInEenWoonplaatsIs3() {
        when(repository.findMetStreepjes()).thenReturn(List.of("a-b", "a-b-c", "a-b-c-d", "e-f-g-h", "i-j"));
        assertThat(service.maxAantalStreepjesInEenWoonplaats()).isEqualTo(3L);
        verify(repository).findMetStreepjes();
    }

}
