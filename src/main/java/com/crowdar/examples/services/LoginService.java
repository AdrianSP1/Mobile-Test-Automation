package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {
    public static void emailInput(String email){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT, email);

    }    public static void passInput(String password){
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
    }

    public static void clickLogin(){
        MobileActionManager.click(LoginConstants.SIGN_IN);

    }

    public static void doLogin(String email, String password){
        emailInput(email);
        passInput(password);
        clickLogin();
    }

    }
