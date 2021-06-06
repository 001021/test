package mall;

import java.util.*;

public class LoginManager {
	CustomerManager customerManager;
	ArrayList<Customer> loggedUser; // Customer�κ��� login User�� name �޾ƿ�

	public void login(int id, String pwd)
	{
		customer = customerManager;
		Customer customer = customerManager.search(id); // id�� customerManager���� �˻�

		if (customer.getPwd().equals(pwd)) // pwd�� �´��� Ȯ��
		{
			loggedUser.add(customer); // ArrayList�� loggedUser �߰�
			System.out.println("ID : " + customer.getId() + "NAME: " + customer.getName() + "�α����ϼ̽��ϴ�."");
		}
		else
		{
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}

	public void logout(int id) {
		int position = isExist(id); // id�� ���� �α��� ������ Ȯ��

		loggedUser.remove(position); // id�� �ε����� �޾ƿͼ� ����
		System.out.println(id + " �� �α׾ƿ��ϼ̽��ϴ�.");
	}
	
	public void displayLoggedUser() { // �α��� ������ �ε��� �޾ƿ���
		for (int i = 0; i < loggedUser.size(); i++)
		{
			System.out.println(loggedUser.get(i));
		}
	}
	
	public int isExist(int id) {
		for (int i = 0; i < loggedUser.size(); i++)
		{
			if (loggedUser.get(i).getId() == id)
			{
				return i;
			}
		}
		return -1;
	}
}

