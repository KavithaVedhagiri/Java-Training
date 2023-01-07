public class StringFrequency {
    public static void main(String[] args) {
        String name = "Akshinth Devesh";
        char[] ar = name.toCharArray();
        int [] freq = new int[ar.length];
        for (int i = 0;i<ar.length;i++){
            int count = 1;
            for (int j =i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if (freq[i]!=-1){
                freq[i]=count;
            }
        }
        for (int i = 0;i<ar.length;i++){
            if (freq[i]>0){
                System.out.println(ar[i]+"Occurs at "+freq[i]);
            }
        }
        System.out.println();
        int maximum = Integer.MIN_VALUE;
        int position = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maximum) {
                maximum = freq[i];
                position = i;
            }
        }
        System.out.println(maximum + " comes at" + " " + " positon" + " " + position);
         System.out.println();
        int min = Integer.MAX_VALUE;
        int position1 = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1) {
                if (freq[i] < min) {
                    min = freq[i];
                    position1 = i;
                }
            }
        }
        System.out.println(min + " comes at" + " " + " positon" + " " + position1);
    }
}
