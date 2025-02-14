package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceImplSetterInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From the Setter Injected Service";
    }
}
