package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.services.AuthenticationService;
import org.springframework.stereotype.Service;

/**
 * Created by codecadet on 14/12/2018.
 */
@Service
public class MockAuthenticateService extends AbstractMockService<User> implements AuthenticationService {
    @Override
    public Boolean authenticateUser(String username, String password) {
        return null;
    }
}
