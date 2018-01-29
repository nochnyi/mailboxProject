package com.company.Mails;

public class Mail {
	private String emailAddressInputfield;
	private String mailSubject;
	private String mailTextArea;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Mail)) return false;

		Mail mail = (Mail) o;

		if (!emailAddressInputfield.equals(mail.emailAddressInputfield)) return false;
		if (!mailSubject.equals(mail.mailSubject)) return false;
		return mailTextArea.equals(mail.mailTextArea);
	}

	@Override
	public int hashCode() {
		int result = emailAddressInputfield.hashCode();
		result = 31 * result + mailSubject.hashCode();
		result = 31 * result + mailTextArea.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Mail{" +
				"emailAddressInputfield='" + emailAddressInputfield + '\'' +
				", mailSubject='" + mailSubject + '\'' +
				", mailTextArea='" + mailTextArea + '\'' +
				'}';
	}

	public Mail(String emailAddressInputfield, String mailSubject, String mailTextArea) {
		this.emailAddressInputfield = emailAddressInputfield;
		this.mailSubject = mailSubject;
		this.mailTextArea = mailTextArea;
	}

	public String getEmailAddressInputfield() {
		return emailAddressInputfield;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public String getMailTextArea() {
		return mailTextArea;
	}

	public void setEmailAddressInputfield(String emailAddressInputfield) {
		this.emailAddressInputfield = emailAddressInputfield;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public void setMailTextArea(String mailTextArea) {
		this.mailTextArea = mailTextArea;
	}
}
