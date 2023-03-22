package Entity;

public class User {

	private int Id;
	private String FullName;
	private String Username;
	private String Bio = "Hello! Ask me to change This BIO.";
	private String ProfilePic;
	private String Email;

	public User(String fullName, String username, String bio, String profilePic, String email) {
		FullName = fullName;
		Username = username;
		Bio = bio;
		ProfilePic = profilePic;
		Email = email;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", FullName=" + FullName + ", Username=" + Username + ", Bio=" + Bio + ", ProfilePic="
				+ ProfilePic + ", Email=" + Email + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getBio() {
		return Bio;
	}

	public void setBio(String bio) {
		Bio = bio;
	}

	public String getProfilePic() {
		return ProfilePic;
	}

	public void setProfilePic(String profilePic) {
		ProfilePic = profilePic;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
