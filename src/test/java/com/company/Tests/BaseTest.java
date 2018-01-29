package com.company.Tests;

import com.company.App;
import com.company.Mails.Mail;
import com.company.Mails.MailFactory;
import com.company.Users.User;
import com.company.Users.UserFactory;
import org.testng.annotations.AfterSuite;

import java.util.List;

public class BaseTest {
    protected static User validUser = UserFactory.getValidUser();
    protected static App app = new App();
    protected static Mail incomingMail = MailFactory.getIncomingMail();
//    protected static List<User> validUsers = UserFactory.getListValidUsers(10);

    @AfterSuite
    public void tearDownSuite() throws Exception {
        app.common.closeApp();
    }
}
