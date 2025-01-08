package adapter;

import com.rasrov.shopping.list.serviceport.CartServicePort;
import com.rasrov.shopping.list.adapter.CartServiceAdapter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {
        CartServiceAdapter.class
})
public class CartServiceAdapterTest {

    @Autowired
    private CartServiceAdapter cartServiceAdapter;

    @MockitoBean
    private CartServicePort cartServicePort;

    @Test
    void should_be_create_service_with_not_null_dependencies() {
        assertAll(
                "All dependencies are injected correctly",
                () -> assertThat(cartServiceAdapter).isNotNull(),
                () -> assertThat(cartServicePort).isNotNull()
        );
    }

}
