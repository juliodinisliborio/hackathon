package org.academiadecodigo.hackathon.services;

public interface AuthenticationService {

    Boolean authenticateUser(String username, String password);
}
