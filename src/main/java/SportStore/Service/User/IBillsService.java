package SportStore.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import SportStore.Dto.CartDto;
import SportStore.Entity.Bills;

@Service
public interface IBillsService {
	public int AddBills(Bills bills);
	public void AddBillsDetail(HashMap<Long, CartDto> carts);
}
