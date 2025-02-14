package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplAnotherOne implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From AnotherOne Service!!!";
    }
}
