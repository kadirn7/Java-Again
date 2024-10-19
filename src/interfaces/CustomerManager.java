package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi lan " +customer.getFirstName());
		
		Utils.Runloggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi "+ customer.getFirstName());
		Utils.Runloggers(loggers, customer.getFirstName());
	}
	
}
