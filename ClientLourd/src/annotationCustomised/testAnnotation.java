package annotationCustomised;
import java.lang.annotation.*;
import javax.swing.JOptionPane;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fenetre
{String sTitre();}

public class testAnnotation
{   @Fenetre(sTitre="nnn") 
	private String strVar = "" ;
	
  public static void main(String[] args)
  {	  
   JOptionPane.showMessageDialog(null, "Ceci est le contenu du message");
   System.exit(0);
  }
}