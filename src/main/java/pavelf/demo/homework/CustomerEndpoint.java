package pavelf.demo.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@RestControllerEndpoint(id = "customer")
public class CustomerEndpoint extends AbstractHomeworkEndpoint<Customer> {

    @Autowired CustomerEndpoint(JpaRepository<Customer, Long> repository) {
        super(repository);
    }
}