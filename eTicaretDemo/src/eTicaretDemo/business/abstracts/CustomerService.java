package eTicaretDemo.business.abstracts;



import eTicaretDemo.entities.concretes.Customer;

public interface CustomerService {
	void register(Customer customer);
	void login(Customer customer ,String email , String password);
	boolean checkMailAddress(Customer customer);
	void mailConfirmotion( Customer customer);
	boolean verif(Customer  customer);

}
