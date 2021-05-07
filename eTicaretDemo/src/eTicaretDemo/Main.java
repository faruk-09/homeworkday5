package eTicaretDemo;


import eTicaretDemo.business.concretes.CustomerManager;
import eTicaretDemo.core.GoogleManagerAdapter;
import eTicaretDemo.core.GoogleService;
import eTicaretDemo.dataAccess.concretes.HibernateCustomerDao;
import eTicaretDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		HibernateCustomerDao hibernateCustomerDao = new HibernateCustomerDao();
		CustomerManager customerManager = new CustomerManager(hibernateCustomerDao, null);
		Customer customer = new Customer(1, "Faruk", "Aydýn", "faruk_aydin_09@hotmail.com", "111111");
		customerManager.register(customer);
		customerManager.login(customer, "faruk_aydin_09@hotmail.com", "1111111");
		customerManager.mailConfirmotion(customer);
		customerManager.checkMailAddress(customer);
		customerManager.verif(customer);
		
		
		
		Customer customer1 = new Customer(5, "Serdar " , "Aydemir " , "farukay09@outlook.com" , "1234");
		customerManager.login(customer1 , "farukay09@outlook.com" , "1234" );
		
		GoogleService service = new GoogleManagerAdapter();	
		service.googleAdapater(null);
	}

}
