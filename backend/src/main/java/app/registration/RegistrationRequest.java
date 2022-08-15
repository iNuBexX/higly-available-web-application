package app.registration;



public class RegistrationRequest {
    private final String userName;
    private final String password;
    
    public RegistrationRequest(String userName,String password)
    {
    	this.userName = userName;
    	this.password = password;
    }
	public String getUserName() {
		
		return userName;
	}
	public String getPassword()
	{
		return password;
	}
}
