package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class EnvironmentServiceProdImpl implements EnvironmentService {

    @Override
    public String getEnv() {
        return "prod";
    }
}
