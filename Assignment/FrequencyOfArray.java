public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 10, 20, 30, 40, 10, 20, 30, 60, 70};
        int[] arr = new int[a.length];
        int freq[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            // int no = a[i];
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
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
                arr[j] = a[i];
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
                System.out.println(a[i] + "appeared " + freq[i] + " times");
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (freq[i] >= 1) {
                System.out.println(a[i] + "occurs " + freq[i] + " times");
            }
        }
        System.out.println();
        int countofDuplicates = 0;
        for (int i = 0; i < a.length; i++) {
            if (freq[i] > 1) {
                countofDuplicates++;
                System.out.println(a[i] + "occurs " + freq[i] + " times");
            }
        }
        System.out.println();
        System.out.println("Total no of Duplictes :" + countofDuplicates);
        int unique = 0;
        for (int i = 0; i < a.length; i++) {
            if (freq[i] == 1) {
                unique++;
                System.out.println(a[i] + "occurs " + freq[i] + " times");
            }
        }
        System.out.println("Total no of Unique :"+unique);
    }
}