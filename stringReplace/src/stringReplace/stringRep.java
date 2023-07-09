package stringReplace;
public class stringRep {
	public static void main (String args[]) {
		String a = "Mary had a little lamb,\nIts fleece was white was snow.";
		String b = "\nEverywhere the child went,\nThe little lamb was sure to go.";
		System.out.println(a.replace("lamb", "sheep").replace("white", "black") + b.replace("went", "go").replace("little", "huge"));
	}
}
