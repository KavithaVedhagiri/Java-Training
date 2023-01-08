public class StringFrequencyDemo {
    public static void main(String[] args) {
        String name = "Akshinth Devesh";
        char[] ar = name.toCharArray();
        char[] arr = new char[ar.length];
        int[] freq = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                arr[j] = ar[i];
                j++;
            }
        }
        System.out.println("Printing arr Duplicate element in another array :");
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] >0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println(ar[i] + "appeared " + freq[i] + " times");
            }
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            if (freq[i] >= 1) {
                System.out.println(ar[i] + "occurs " + freq[i] + " times");
            }
        }
        System.out.println();
        int countofDuplicates = 0;
        for (int i = 0; i < ar.length; i++) {
            if (freq[i] > 1) {
                countofDuplicates++;
                System.out.println(ar[i] + "occurs " + freq[i] + " times");
            }
        }
        System.out.println();
        System.out.println("Total no of Duplictes :" + countofDuplicates);
        int unique = 0;
        for (int i = 0; i < ar.length; i++) {
            if (freq[i] == 1) {
                unique++;
                System.out.println(ar[i] + "occurs " + freq[i] + " times");
            }
        }
        System.out.println("Total no of Unique :"+unique);
    }
}
