package Day08.encap.obj;

public class Chef {
	
	//지금은 이름 강제로 지정한 상태
	private String name = "홍연복";
	
	public void cooking() {
		System.out.println("요리사");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
