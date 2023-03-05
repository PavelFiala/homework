package pavelf.demo.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@RestControllerEndpoint(id = "subscription")
public class SubscriptionEndpoint extends AbstractHomeworkEndpoint<Subscription> {

    @Autowired SubscriptionEndpoint(JpaRepository<Subscription, Long> repository) {
        super(repository);
    }
}