
public class Account {

	private int accnumber;
	
	private double balance;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	
	public Account(){
		this(12,1000,"dm@mail.ru","Andrew","+189212345");
		System.out.println("Empty constructor called!");
	}
	
	public Account(int accnumber,double balance,String customermail, String customername,String customerphone){
		System.out.println("Not Empty constructor called!");
		this.accnumber = accnumber;
		this.balance = balance;
		this.email = customermail;
		this.name = customername;
		this.phone = customerphone;
	}
	
	//public Account(String mail,String name,String phone){
	//	this()
	//}
	public void setaccnumber(int number){
		this.accnumber = number;
	}
	
	public int getaccnumber(){
		
		return this.accnumber;
	}
	
	public void setbalance(double balance){
	    this.balance = balance;
	}
	
	public double getbalance(){
		return this.balance;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public String getname(){
		return this.name;
	}
	
	public void setmail(String mail){
		this.email = mail;
	}
	
	public String getemail(String mail){
		return this.email;
	}
	
	public void setphone(String phone){
		this.phone = phone;
	}
	
	public String getphone(String phone){
		return this.phone;
	}
	
	public void withdrawl(int countwithdrawl){
		if(this.balance<countwithdrawl){
			System.out.println("Unsufficient count of money");
		}
		else{
			this.balance-=countwithdrawl;
		}
	}
	
	public void deposit(int depositsum){
		if(depositsum<=0){
			System.out.println("Deposit must be more than zero");
		}
		else{
			this.balance = this.balance + depositsum;
		}
	}
	
}
