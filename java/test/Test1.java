package test;

import test.entity.User;
import test.entity.UserBuilder;

public class Test1 {
    public static void main(String[] args) {
        User user = new UserBuilder().withPassword("dnweapons7s").withName("Baiysh").build();
        System.out.println(user);
        User user2 = new UserBuilder().withPassword("dnweapons7s333333").withName("Baiysh333333333").build();
        System.out.println(user2);
    }
}
