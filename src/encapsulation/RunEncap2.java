package encapsulation;

public class RunEncap2 {

	public static void main(String[] args)
	{
		EncapTest encap = new EncapTest();
	      encap.setName("Yogi");
	      encap.setAge(30);
	      encap.setIdNum("100ms");
	      System.out.println("Name : " + encap.getName());
	      System.out.println("Age : " + encap.getAge());
	      System.out.println("ID : " + encap.getIdNum());



	}

}
