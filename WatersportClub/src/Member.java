public class Member {
    private String name;
    private String firstName;
    private String phoneNumber;
    private  double discountPercentage;

    public Member(String name, String firstName, String phoneNumber, double discountPercentage) {
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.discountPercentage = discountPercentage;
    }
    public String getFullName(){
        return firstName + " " + name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String toString(){
        return getFullName()+ "\n " + phoneNumber + "\n Discount :"+ discountPercentage + "%";
    }
}
