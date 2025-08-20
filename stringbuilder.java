public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("TONY");
        // 
        // insert the element
        sb.insert(2, "n");
        System.out.println(sb);
// get a chacacter from index
StringBuilder SB=new StringBuilder("TONY");
// get char
System.out.println(sb.charAt(0));

// set char
sb.setCharAt(0,'p');
System.out.println(sb);
// delet char
sb.delete(0, 1);
System.err.println(sb);
// append a char
sb.append("stark");
System.out.println(sb);
// printing lenght of strings
System.out.println(sb.length());
    }
}

