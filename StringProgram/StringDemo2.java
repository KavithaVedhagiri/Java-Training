public class StringDemo2 {
public static void main(String[] args) {
StringDemo2 sd = new StringDemo2();
sd.vowelsString();
sd.printonlynumbers();
sd.printonlysplchar();
}
 private void printonlysplchar() {
        String name = "Mohanapriya2645@gmail.com";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                //System.out.println(name.charAt(i));
            }
            else if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')||(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
                //System.out.print(name.charAt(i));
            }
            else{
                System.out.print(name.charAt(i));
            }
        }
    }
private void printonlynumbers() {
        String name = "Mohanapriya2654";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                System.out.print(name.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')||(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
                System.out.print(name.charAt(i));
            }
        }
    }
private void vowelsString() {
        String name = "Akshinth Devesh";
        int count =0;
        for (int i = 0;i<name.length();i++){
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
