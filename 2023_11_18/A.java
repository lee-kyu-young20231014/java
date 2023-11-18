package mypackage;

public class A {

	public int v_public;
	protected int v_protected;
	int v_default;
	private int v_private;
	
	public void innerMethod() {
		System.out.println(v_public);
		System.out.println(v_protected);
		System.out.println(v_default);
		System.out.println(v_private);
	}
}
