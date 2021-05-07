package eTicaretDemo.business.concretes;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.CustomerService;
import eTicaretDemo.core.GoogleManagerAdapter;
import eTicaretDemo.core.GoogleService;
import eTicaretDemo.dataAccess.abstracts.CustomerDao;
import eTicaretDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private GoogleManagerAdapter googleManagerAdapter;
	
	
	


	public CustomerManager(CustomerDao customerDao, GoogleManagerAdapter googleManagerAdapter) {
		super();
		this.customerDao = customerDao;
		this.googleManagerAdapter = googleManagerAdapter;
	}
	

	@Override
	public void register(Customer customer) {
		if(checkMailAddress(customer)==true && customer.getPassword().length()>=6 && verif(customer) == true && customer.getFirstName().length()>=2 && customer.getLastName().length()>=2) {
			System.out.println("M��teri kayd� olu�turuldu ");
		}else {
			System.out.println("Girdi�iniz bilgiler hatal�. L�tfen bilgilerinizi kontrol ediniz."); 
		}
	
	}

	@Override
	public void login(Customer customer, String email, String password) {
		if(email == customer.getEmail() && password == customer.getPassword()) {
			System.out.println("Giri� yap�ld� ho�geldiniz : " +customer.getFirstName() +" "+customer.getLastName() );
		}else {
			System.out.println("E-posta veya �ifre hatal�! L�tfen tekrar deneyiniz");
		}
		
	}

	@Override
	public boolean checkMailAddress(Customer customer) {
		Pattern pattern =Pattern.compile("@");
		Pattern pattern1 =Pattern.compile(".com");
		Matcher matcher = pattern.matcher(customer.getEmail());
		Matcher matcher1 = pattern1.matcher(customer.getEmail());
		if (matcher.find() && matcher1.find() == true) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public void mailConfirmotion(Customer customer) {
		System.out.println("Hesap do�rulama maili g�nderildi");
		
	}

	@Override
	public boolean verif(Customer customer) {
		System.out.println("Mail adresiniz do�ruland�! te�ekk�rler...");
		return false;
	}

}
