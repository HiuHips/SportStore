package SportStore.Service.User;

import org.springframework.stereotype.Service;

import SportStore.Entity.Users;

@Service
public interface IAccountService {
		
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
}
