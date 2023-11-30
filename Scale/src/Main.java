// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scale scale = new Scale();
        scale.addWeightLeft(5);
        scale.addWeightRight(3);
        System.out.println("The left scale weight is "+scale.getLeftScale()+ ", the right scale is " + scale.getRightScale()+ " and the stand is " + scale.getResult());
        scale.takeWeightLeft(3);
        scale.takeWeightRight(1);
        System.out.println("The left scale weight is "+scale.getLeftScale()+ ", the right scale is " + scale.getRightScale()+ " and the stand is " + scale.getResult());
        scale.setWeightLeft(2);
        scale.setWeightRight(5);
        System.out.println("The left scale weight is "+scale.getLeftScale()+ ", the right scale is " + scale.getRightScale()+ " and the stand is " + scale.getResult());
    }
}