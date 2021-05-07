package eTicaretDemo.dataAccess.concretes;

import java.util.List;

import eTicaretDemo.dataAccess.abstracts.CustomerDao;
import eTicaretDemo.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile eklendi : " +customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hibernate ile silindi : " +customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Hibernate ile g�ncellendi : " +customer.getFirstName());
		
	}

	@Override
	public Customer get(int id) {
		System.out.println("Kulln�c� Detaylar� :");
		return null;
	}

	@Override
	public List<Customer> getAll() {
		System.out.println("Liste olu�turuluyor...");
		return null;
	}

}
