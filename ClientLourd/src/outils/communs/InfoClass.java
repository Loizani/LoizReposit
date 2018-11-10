package outils.communs;

public class InfoClass {

	public void show() {
        System.out.print(getClass().getName() + " inner in...");
        System.out.println(getClass().getSuperclass().getClassLoader().getClass().getName());    
     }
	
}