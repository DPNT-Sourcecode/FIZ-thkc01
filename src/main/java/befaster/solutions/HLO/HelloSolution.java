package befaster.solutions.HLO;


public class HelloSolution {
    public String hello(String friendName) {
        checkIfFriendNameIsValid(friendName);
        return "Hello, " + friendName + "!";
    }

    private void checkIfFriendNameIsValid(String friendName) {
        if (friendName == null) {
            throw new FriendNameCantBeNullException();
        }
    }
}
