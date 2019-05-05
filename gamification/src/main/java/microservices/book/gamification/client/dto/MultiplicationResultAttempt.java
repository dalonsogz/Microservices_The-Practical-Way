package microservices.book.gamification.client.dto;

public final class MultiplicationResultAttempt {

    private final String userAlias;

    private final int multiplicationFactorA;
    private final int multiplicationFactorB;
    private final int resultAttempt;

    private final boolean correct;

    // Empty constructor for JSON/JPA
    MultiplicationResultAttempt() {
        userAlias = null;
        multiplicationFactorA = -1;
        multiplicationFactorB = -1;
        resultAttempt = -1;
        correct = false;
    }

}
