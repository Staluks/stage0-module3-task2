package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int phoneNumber, age;

    void callToFriend() {
        int number = phoneNumber;
    }

    void callByNumber(int number) {
        phoneNumber = number;
    }
}
