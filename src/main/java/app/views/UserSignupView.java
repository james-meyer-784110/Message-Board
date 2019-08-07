package app.views;

import app.models.User;
import app.util.Result;

import java.util.Optional;

public class UserSignupView extends User {

    public static final int PASSWORD_MISMATCH = 1;
    public static final int NULL_VALUE = 2;

    private String confirmPassword;

    public UserSignupView(){}

    public UserSignupView(UserSignupView copy){
        this.setUsername(copy.getUsername());
        this.setEmail(copy.getEmail());
        this.setPassword(copy.getPassword());
        this.setConfirmPassword(copy.getConfirmPassword());
    }

    public void setConfirmPassword(String cpass){
        if(cpass.length() <= this.MAX_FEILD_LENGTH) {
            this.confirmPassword = cpass;
        }
    }

    public String getConfirmPassword(){
        return this.confirmPassword;
    }

    public Result<User,Integer> toUser(){
        if(this.getUsername() == null || this.getEmail() == null || this.getPassword() == null || this.getConfirmPassword() == null){
            return Result.err(NULL_VALUE);
        }
        else if(!this.confirmPassword.equals(this.getPassword())){
            return Result.err(PASSWORD_MISMATCH);
        }
        return Result.ok(new User(this.getUsername(), this.getEmail(), this.getPassword(), null));
    }
}
