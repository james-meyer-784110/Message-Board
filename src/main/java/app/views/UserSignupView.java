package app.views;

import app.models.User;

import java.util.Optional;

public class UserSignupView extends User {

    private String confirmPassword;

    public void setConfirmPassword(String cpass){
        if(cpass.length() <= this.MAX_FEILD_LENGTH) {
            this.confirmPassword = cpass;
        }
    }

    public String getConfirmPassword(){
        return this.confirmPassword;
    }

    public Optional<User> toUser(){
        if(this.confirmPassword.equals(this.getPassword())
                && this.getUsername() != null
                && this.getPassword() != null
                && this.getEmail() != null) {
            return Optional.of(new User(this.getUsername(), this.getEmail(), this.getPassword(), null));
        }else{
            return Optional.empty();
        }
    }
}
