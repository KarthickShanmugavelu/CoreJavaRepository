package equals;

public class Class1 {
	
	private int id;
	private String name;
	public Class1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class1 other = (Class1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Class1 ob1 = new Class1(5,"Sam");
		Class1 ob2 = new Class1(5,"Sam");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.getClass());
		Double val=Double.valueOf(9.9);
		Double val1=Double.valueOf(val);
		System.out.println(val==val1);
		
	}
	

}
