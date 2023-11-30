public class Main {
    public static void main(String args[])
    {
        

        Student student = new Student("Deckers","Pieter",2004,false);
        student.bookStudyPoints(60);
        System.out.println(student.getFullName() + "has chosen " +student.getChosenPoints() +" points and has to pay : € "+ student.getStudyCost());
        student.progressPeriod(23);
        System.out.println("The " + student.getLastPeriod()+" period has passed " + student.getFullName()+ " has " + student.getChosenPoints() + " points remaining and succeeded for "+ student.getPointsSucceeded() );
        student.progressPeriod(30);
        System.out.println("The " + student.getLastPeriod()+" period has passed " + student.getFullName()+ " has " + student.getChosenPoints() + " points remaining and succeeded for "+ student.getPointsSucceeded() );
        student.progressPeriod(0);
        System.out.println("The " + student.getLastPeriod()+" period has passed " + student.getFullName()+ " has " + student.getChosenPoints() + " points remaining and succeeded for "+ student.getPointsSucceeded() );
        student.bookStudyPoints(67);
        System.out.println(student.getFullName() + "has chosen " +student.getChosenPoints() +" points and has to pay : € "+ student.getStudyCost());
        student.progressPeriod(23);
        System.out.println("The " + student.getLastPeriod()+" period has passed " + student.getFullName()+ " has " + student.getChosenPoints() + " points remaining and succeeded for "+ student.getPointsSucceeded() );
        student.progressPeriod(30);
        System.out.println("The " + student.getLastPeriod()+" period has passed " + student.getFullName()+ " has " + student.getChosenPoints() + " points remaining and succeeded for "+ student.getPointsSucceeded()  );
        student.progressPeriod(14);
        System.out.println("The " + student.getLastPeriod()+" period has passed " + student.getFullName()+ " has " + student.getChosenPoints() + " points remaining and succeeded for "+ student.getPointsSucceeded() );
    }
}
