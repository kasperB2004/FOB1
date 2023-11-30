public class Main {
    public static void main(String[] args) {

        MijnArray sortedArray1 = new MijnArray(new int[] {1, 3, 5, 7, 9});
        MijnArray sortedArray2 = new MijnArray(new int[] {-2, 0, 4, 6, 8, 10});
        MijnArray unsortedArray = new MijnArray(new int[]  {9, 2, 5, 1, 7, 4, 8, 3, 6});

        System.out.println(sortedArray2.getDetail());
        System.out.println(unsortedArray.getDetail());

        System.out.println(sortedArray1.zoek(3));
        System.out.println(unsortedArray.zoek(1));

        System.out.println(sortedArray1.samenvoegen(sortedArray2).getDetail());
        System.out.println(sortedArray1.samenvoegen(unsortedArray).getDetail());


    }


}