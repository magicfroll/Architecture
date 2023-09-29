package seminar_12;

import static org.junit.jupiter.api.Assertions.*;

class AccessesRepoTest {

    @org.junit.jupiter.api.Test
    void setUser() {
        AccessesRepo accessesRepoTest = new AccessesRepo(new User("Кирилл"), new Group("Архитектура ПО"));
        User userTest = new User("Моисеев Кирилл");
        accessesRepoTest.setUser(userTest);
        assertEquals(userTest, accessesRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void setGroup() {

    }

    @org.junit.jupiter.api.Test
    void getUser() {
        User userTest = new User("Кирилл");
        AccessesRepo accessesRepoTest = new AccessesRepo(userTest, new Group("Архитектура ПО"));
        assertEquals(userTest, accessesRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void getGroup() {
        Group groupTest = new Group("Архитектура ПО");
        AccessesRepo accessesRepoTest = new AccessesRepo(new User("Кирилл"), groupTest);
        assertEquals(groupTest, accessesRepoTest.getGroup());
    }
}