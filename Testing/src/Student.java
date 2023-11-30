public class Student
{
    private String name;
    private String firstName;
    private int birthYear;
    private int pointsSucceeded;
    private int academicYears;
    private Periods period;
    private Periods lastPeriod;
    private int chosenPoints;
    private boolean scholorschip;

    public Student(String name, String firstName, int birthYear, boolean scholorschip)
    {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.scholorschip = scholorschip;
        this.pointsSucceeded = 0;
        this.chosenPoints = 0;
        this.lastPeriod = Periods.January;
        this.period = Periods.January;
        this.academicYears = 0;
    }


    public int getBirthYear()
    {
        return birthYear;
    }

    public int getPointsSucceeded()
    {
        return pointsSucceeded;
    }

    public int getAcademicYears()
    {
        return academicYears;
    }

    public Periods getPeriod()
    {
        return period;
    }

    public Periods getLastPeriod()
    {
        return lastPeriod;
    }

    public int getChosenPoints()
    {
        return chosenPoints;
    }

    public boolean isScholorschip()
    {
        return scholorschip;
    }

    public double getStudyCost()
    {
        //calculate the study cost using a ternary operator as to see if they're in a scholorschip
        return  (scholorschip == false) ? 247.90 + chosenPoints * 11.90 : 247.90;
    }

    public void setScholorschip(boolean scholorschip)
    {
        this.scholorschip = scholorschip;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLoginName()
    {
        
        String loginName = name.substring(0,3) + firstName.substring(0,2) + (birthYear/10);
        return loginName;
    }

    public void bookStudyPoints(int points)
    {
        chosenPoints = points;
    }


    public String getFullName()
    {
        return firstName + " " + name;
    }

    public int getAge()
    {
        int currentYear = java.time.LocalDate.now().getYear();
        return currentYear-birthYear;
    }

    public void progressPeriod(int succeededpoints)
    {
        switch (period){
            case January :
                pointsSucceeded += succeededpoints;
                chosenPoints -= succeededpoints;
                lastPeriod = period;
                period = Periods.June;
                break;
            case June :
                pointsSucceeded += succeededpoints;
                chosenPoints -= succeededpoints;
                lastPeriod = period;
                period = Periods.September;
                break;
            case September:
                pointsSucceeded += succeededpoints;
                chosenPoints = 0;
                lastPeriod = period;
                period = Periods.January;
                academicYears++;
                break;
        }
    }


}
enum Periods
{
    January,
    June,
    September
}