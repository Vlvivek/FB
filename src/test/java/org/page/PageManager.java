package org.page;

public class PageManager {

	private LoginPage loginPage;
	
	private ForgotPage forgotPage;
	
	private CreatePage createPage;
	
	private NewAccount account;
	
	public LoginPage getloginPage() {
		if(loginPage==null) {
			loginPage=new LoginPage();
		}
		return loginPage;
	}
	public ForgotPage getForgetPage() {
		if(forgotPage==null) {
			forgotPage=new ForgotPage();
		}
		return forgotPage;
	}
	public CreatePage getCreatePage() {
		if(createPage==null) {
			createPage=new CreatePage();
		}
		return createPage;
	}
	public NewAccount getAccount() {
		if(account==null) {
			account=new NewAccount();
		}
		return account;
	}
}
