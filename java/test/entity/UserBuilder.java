package test.entity;

public class UserBuilder {
    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder withName(String userName){
        user.setUserName(userName);
        return this;
    }

    public UserBuilder withPassword(String password){
        user.setPassword(password);
        return this;
    }

    public User build(){
        return this.user;
    }


}
