package java_Fundamentals;

public class Array7 {

    public static void main(String[] args) {
        int count = 0;
        int arr[] = {12, 34, 12, 45, 67, 89};
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++;
            }
        }

        // FIXED LINE: print unique elements
        for (int j = 0; j < count; j++) {
            System.out.print(arr[j]);
            if (j < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
