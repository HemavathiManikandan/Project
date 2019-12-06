package constructor;

public class CtrlStmts extends DataTypes{
	
	public CtrlStmts() {
		super();
		System.out.println("Child class");
	}
	public CtrlStmts(int empId) {
		
		System.out.println(empId);
	}

	public static void main(String[] args) {
		CtrlStmts c=new CtrlStmts();
		CtrlStmts c1=new CtrlStmts(4567);
		
		

	}

}
