
public class VipCustomer {

	private String name;
	
	private int creditlimit;
	
	private String emailadress;

	public VipCustomer(){
		this("Tim",10000,"bk@bk");
	}
	public VipCustomer(String name,int limit){
		this();
	}
	public VipCustomer(String name,int limit,String adress){
		this.name = name;
		this.emailadress = adress;
		this.creditlimit = limit;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}

	public String getEmailadress() {
		return emailadress;
	}

	public void setEmailadress(String emailadress) {
		this.emailadress = emailadress;
	}
	
	
}
