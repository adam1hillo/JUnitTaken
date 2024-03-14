package be.vdab.taken;

import java.util.List;
import java.util.stream.Stream;

public class WoonplaatsRepositoryStub extends WoonplaatsRepository{

    @Override
    List<String> findMetStreepjes() {
        return List.of("a-b", "a-b-c", "a-b-c-d", "e-f-g-h", "i-j");
    }
}
