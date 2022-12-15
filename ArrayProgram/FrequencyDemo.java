public class FrequencyDemo {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 10, 20, 30, 10, 10, 20, 30,  60,  70};
        int freq[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int no = a[i];
            int add = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (no == a[j]) {
                    add++;
                    freq[j] =-1;
                }
            }
            if (freq[i] !=-1) {
                freq[i] = add;
            }
        }
        for (int i = 0; i < a.length; i++)
             {
            //System.out.println(freq[i] + " ");
             }
        int maximum = Integer.MIN_VALUE;
        int position = 0;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i]>maximum) {
                    maximum = freq[i];
                }
            }
            System.out.println(a[position]+" positon"+" "+maximum);
        }
    }
//}
