public class StringDemo {
 public static void main(String[] args) {
 StringDemo sd = new StringDemo();
 sd.firstnonrepeate();
 sd.firstrepeatedcharacter();
 sd.lastnonrepeated();
 sd.lastrepeatedcharacter();
}
private void lastrepeatedcharacter() {
        String name = "Akshinth Devesh";
        for (int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i);
            boolean result = false;
            for (int j = i - 1; j >= 0; j--) {
                if (ch == name.charAt(j)) {
                    System.out.println("Last Repeated Character : " + ch);
                    result = true;
                    break;
                }
            }
            if (result==true){
                break;
      }
   }
}
private void lastnonrepeated() {
  String name = "Akshinth Devesh";
       for (int i = name.length()-1;i>=0;i--){
           char ch = name.charAt(i);
           boolean result = false;
           for (int j=i-1;j>=0;j--) {
               if (ch == name.charAt(j)) {
                   result = true;
                   break;
               }
           }
           if (result == false) {
               System.out.println("Last Non Repeated Character :" + ch);
               break;
           }
       }
    }

private void firstrepeatedcharacter() {
        String word = "Kavitha";
        for (int i = 0; i<word.length();i++) {
            char ch = word.charAt(i);
            boolean result = false;
            for (int j = i + 1; j<word.length();j++) {
                if (ch == word.charAt(j)){
                    System.out.println("First Repeated Character : " + ch);
                    result = true;
                    break;
                }
            }
            if (result==true){
                break;
            }
        }
    }

private void firstnonrepeate() {
        String word = "Kavitha";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            boolean result = false;
            for (int j = i + 1; j < word.length(); j++) {
                if (ch == word.charAt(j)) {
                    result = true;
                    break;
                }
            }
            if (result == false) {
                System.out.println("First Non Repeated Character :" + ch);
                break;
            }
        }
    }
}
