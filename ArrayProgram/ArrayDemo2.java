public class ArrayDemo2 {
    public static void main(String[] args) {
        ArrayDemo2 ad = new ArrayDemo2();

ad.additionoftwoarray1();
}

private void additionoftwoarray1() {
        int ar[] = {10, 45, 15, 76};
        int ar1[] = {12, 74, 24, 48, 88, 48, 75, 64};
        int len = ar.length > ar1.length ? ar.length : ar1.length;
        int arr[] = new int[len];
        int small = ar.length < ar1.length ? ar.length : ar1.length;
        int i = 0;
        for (; i < small; i++) {
            arr[i] = ar[i] + ar1[i];
        }
        while (i < len) {
            arr[i] = ar1[i];
            i++;
        }
        System.out.println("Array addition values :");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
}
}
}
