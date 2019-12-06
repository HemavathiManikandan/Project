package constructor;

public class DataTypes {
	public DataTypes() {
		this("hema");
		System.out.println("Default Cons");
	}
	public DataTypes(String name) {
		this(30);
		System.out.println("hema");
	}
	public DataTypes(int age) {
		this(79.3f);
		System.out.println(age);
	}
	public DataTypes(float avg) {
		System.out.println(avg);
	}
		
	
	public static void main(String[] args) {
		DataTypes d=new DataTypes();
		
		

	}

}
