package webapp;

public class UserValidationService {

	public boolean isValid(String name,String pwd) {
		if(name.equals("Vipul")&&pwd.equals("admin"))
			return true;
		return false;
	}
}
