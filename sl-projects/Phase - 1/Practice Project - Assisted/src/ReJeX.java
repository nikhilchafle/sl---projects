import java.util.regex.*;

public class ReJeX {

public static void main(String[] args) {

	String pattern = "z";
	String check = "zebra";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
    System.out.println( check.substring( c.start(), c.end() ) );
	
	boolean n=Pattern.compile(".s").matcher("as").matches();
	System.out.println(n);
	
	System.out.println(Pattern.matches("[amn]", "mn"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "n8labs"));
	
	}
}
