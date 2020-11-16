Feature: A new user account can be created if a proper unused username and password are given

    Scenario: creation is successful with valid username and password
        Given command new user is selected
        When  a valid username "liisa" and password "salainen1" and matching password "salainen1" confirmation are entered
        Then  a new user is created

    Scenario: creation fails with too short username and valid password
        Given command new user is selected
        When given too short username "a" and valid password "salainen1" and confirmation "salainen1"
        Then user is not created and error "username should have at least 3 characters" is reported   

    Scenario: creation fails with correct username and too short password
        Given command new user is selected
        When given correct username "toimii" and too short password "a1" and confirmation "a1"
        Then user is not created and error "password should have at least 8 characters" is reported   

    Scenario: creation fails when password and password confirmation do not match
        Given command new user is selected
        When password "erilainen1" and password "erilainen2" confirmation do not match
        Then user is not created and error "password and password confirmation do not match" is reported   
