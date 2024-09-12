public class PlanExceptionUserName extends Exception {
    private String userName;

    PlanExceptionUserName(String userName) {
        this.userName = userName;
    }

    public String toString() {
        return "\"The username:( "+userName+" ) was not valid, it should be like:( USRxxxxxxU )";
    }
}
