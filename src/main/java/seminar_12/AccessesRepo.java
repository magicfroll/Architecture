package seminar_12;

public class AccessesRepo {
    private User user;
    private Group group;

    public AccessesRepo(User user, Group group) {
        this.user = user;
        this.group = group;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public User getUser() {
        return user;
    }

    public Group getGroup() {
        return group;
    }

    public User findUser(){
        return null;
    }


}
