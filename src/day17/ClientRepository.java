package day17;

import java.util.*;

public class ClientRepository {
	private static ClientRepository repository = new ClientRepository();
	private Map<String, ClientDTO> clients = new HashMap<>();
	private List<BreakdownDTO> breakdowns = new ArrayList<>();

	public static ClientRepository getInstance() {
	    return repository;
	}

	public boolean save(ClientDTO clientDTO) {
	    if (clients.containsKey(clientDTO.getId())) {
	        return false;
	    }
	    clients.put(clientDTO.getId(), clientDTO);
	    return true;
	}

	public boolean loginCheck(String id, String password) {
	    if (clients.containsKey(id)) {
	        ClientDTO client = clients.get(id);
	        return client.getPassword().equals(password);
	    }
	    return false;
	}

	public List<ClientDTO> findAll() {
	    return new ArrayList<>(clients.values());
	}

	public ClientDTO findById(String id, String password) {
	    if (clients.containsKey(id)) {
	        ClientDTO client = clients.get(id);
	        if (client.getPassword().equals(password)) {
	            return client;
	        }
	    }
	    return null;
	}

	public List<BreakdownDTO> breakList(String account) {
	    List<BreakdownDTO> list = new ArrayList<>();
	    for (BreakdownDTO b : breakdowns) {
	        if (b.getAccount().equals(account)) {
	            list.add(b);
	        }
	    }
	    return list;
	}

	public String getAccount(String id, String password) {
	    if (clients.containsKey(id)) {
	        ClientDTO client = clients.get(id);
	        if (client.getPassword().equals(password)) {
	            return client.getAccount();
	        }
	    }
	    return null;
	}

	public boolean deposit(String account, long money) {
	    for(String d : clients.keySet()) {
		if (clients.containsKey(account)) {
//	        ClientDTO client = clients.get(account);
//	        client.setBalance(client.getBalance() + money);
	        clients.get(d).setBalance(clients.get(d).getBalance()+money);

	        BreakdownDTO breakdown = new BreakdownDTO();
	        breakdown.setAccount(account);
	        breakdown.setDivision("입금");
	        breakdown.setDealMoney(money);
	        breakdown.setTotalMoney(clients.get(d).getBalance());
	        breakdowns.add(breakdown);

	        return true;
	    }
	    
	}return false;
	}

	public boolean withdraw(String account, long money) {
	    if (clients.containsKey(account)) {
	        ClientDTO client = clients.get(account);
	        if (client.getBalance() >= money) {
	            client.setBalance(client.getBalance() - money);

	            BreakdownDTO breakdown = new BreakdownDTO();
	            breakdown.setAccount(account);
	            breakdown.setDivision("출금");
	            breakdown.setDealMoney(money);
	            breakdown.setTotalMoney(client.getBalance());
	            breakdowns.add(breakdown);

	            return true;
	        }
	    }
	    return false;
	}

	public boolean transferCheck(String transferAccount) {
	    return clients.containsKey(transferAccount);
	}

	public boolean update(String id, String password, String updatePassword) {
	    if (clients.containsKey(id)) {
	        ClientDTO client = clients.get(id);
	        if (client.getPassword().equals(password)) {
	            client.setPassword(updatePassword);
	            return true;
	        }
	    }
	    return false;
	}

	public boolean delete(String id, String password) {
	    if (clients.containsKey(id)) {
	        ClientDTO client = clients.get(id);
	        if (client.getPassword().equals(password)) {
	            clients.remove(id);
	            return true;
	        }
	    }
	    return false;
	}

}
