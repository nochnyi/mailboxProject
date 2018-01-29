package com.company.Mails;

import java.util.ResourceBundle;

public class MailFactory {

	private static ResourceBundle bundle;

	static {

		bundle = ResourceBundle.getBundle("mail");
	}

	public static Mail getIncomingMail() {

		return new Mail(bundle.getString("incoming.emailAddressInputfield"),
				bundle.getString("incoming.mailSubject"),
				bundle.getString("incoming.mailTextArea"));
	}
}
