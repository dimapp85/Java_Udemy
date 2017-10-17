
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car porche = new Car();
		//Car holden = new Car();
		
		//porche.setModel("Carrera");
		//System.out.println("Model is " + porche.getModel());
		
		//System.out.println("Model is " + holden.getModel());
		
		Account acc1 = new Account();
		
		//acc1.setaccnumber(1);
		//acc1.setbalance(1000);
		//acc1.setmail("some@mail.ru");
		//acc1.setname("Hach");
		//acc1.setphone("+79217746591");
		
		acc1.deposit(100);
		System.out.println("Balance is" + acc1.getbalance());
		
		acc1.deposit(-100);
		System.out.println("Balance is" + acc1.getbalance());
		
		acc1.withdrawl(200);
		System.out.println("Balance is" + acc1.getbalance());
		
		acc1.withdrawl(1200);
		System.out.println("Balance is" + acc1.getbalance());
		
		Account acc2 = new Account("dm@mail.ru","Tim","1111111");
		
	}

}
