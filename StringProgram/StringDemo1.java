public class StringDemo1 {
public static void main(String[] args) {
StringDemo1 sd = new StringDemo1();
sd.sumnumbers1();
sd.uppercase();
sd.lowercase();
sd.stringcount("Today is Wednesday");
sd.StringComparison("Devesh","Akshinth");
sd.StringComparison("Devesh","Devesh");
sd.StringComparison("Akshith","Devesh");
}

private void lowercase() {
        String name = "KaViTha";
        for (int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch >= 97 && ch<= 122){
                System.out.print((char)(ch));
            }
            else {
                System.out.print((char)(ch+32));
            }
        }
    }
private void uppercase() {
        String name = "kavitha";
        for (int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch >='A' && ch<= 'Z'){
                System.out.print((char)(ch));
            }
            else {
                System.out.print((char)(ch-32));
            }
        }
    }
private void stringcount(String sentence) {
        int count = 0;
        for (int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);

    }
private void StringComparison(String name, String name1) {
        System.out.println(name.equals(name1));
        System.out.println(name.compareTo(name1));

    }
private void sumnumbers1() {
        String name = "Mohanapriya2654";
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                int no = name.charAt(i) - '0';
                sum = sum + no;
            }
        }
        System.out.println(sum);
    }
}
