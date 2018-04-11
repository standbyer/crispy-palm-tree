package contronller;

import com.opensymphony.xwork2.ActionSupport;

public class CheckAction extends ActionSupport {
	String username;
	String pass;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass){ 
		this.pass = pass;
	}
	
	@Override public void validate(){
	if(username.isEmpty()){
		addFieldError("username",getText("username.isempty"));
	}
	if(username.isEmpty()){
		addFieldError("pass",getText("pass.isempty"));
	}
	}

	@Override
	public String execute() {
		if (username.equals("admin")) {
			System.out.println(getText("welcome", username));
			return SUCCESS;
		} else {
			addActionError(getText("login.fail"));
			return "fail";
		}
	}
}


