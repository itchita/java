package dto;

public class kadai1dto {
	private String name;
	private int age;
	private String gender;
	private String tel;
	private String mail;
	private String password;
	private String sait;
	private String hashedPassword;
	public kadai1dto(String name, int age, String gender, String tel, String mail, String password, String sait,
			String hashedPassword) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tel = tel;
		this.mail = mail;
		this.password = password;
		this.sait = sait;
		this.hashedPassword = hashedPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSait() {
		return sait;
	}
	public void setSait(String sait) {
		this.sait = sait;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	
}
