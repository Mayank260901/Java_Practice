package Lab2;

public class User {
	
	public String email; 
	
	public User(String email) throws InvalidEmailException{
		if(email.contains("@") && email != null){
			System.out.println("This is a valid Email");
		}else {
			throw new InvalidEmailException("This is a Invalid Email Address : " + email);
		}
		this.email=email;
	}

	public static void main(String[] args) {
		 try {
	            User user1 = new User("test@example.com");
	            System.out.println("User1 email: " + user1.email); 

	            User user2 = new User("invalidemail.com"); 
	            System.out.println("User2 email: " + user2.email);
	        } catch (InvalidEmailException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
