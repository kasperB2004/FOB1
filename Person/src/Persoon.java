public class Persoon
{
    private String firstName;
    private String lastName;
    private char sex;

    public Persoon(String firstName, String lastName, char sex) {

        sex = Character.toUpperCase(sex);
        if(sex == 'X' || sex == 'M' || sex == 'V') {
            this.sex = sex;
        }
        else{
            System.out.println("ERROR : Foute ingave geslacht staat op X");
            this.sex = 'X';
        }

        setFirstName(firstName);
        setLastName(lastName);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        int hasTwoNames = firstName.indexOf("-");
        if (hasTwoNames > 0) {
            String nameOne = firstName.substring(0,hasTwoNames);
            String nameTwo = firstName.substring(hasTwoNames+1);
            this.firstName = firstLetterUpper(nameOne)+ "-" + firstLetterUpper(nameTwo);

        }else{

            this.firstName = firstLetterUpper(firstName);
        }


    }

    private String firstLetterUpper(String string){
        String part1 = string.substring(0,1).toUpperCase();
        String part2 = string.substring(1).toLowerCase();

        return part1+part2;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim().toUpperCase();
    }


    public String aanspreektitel(){
        return    ((sex == 'X') ? "Geachte " : (sex == 'V') ? "Geachte Mevrouw " : "Geachte Meneer ") + lastName;
    }

    public String sorteernaam(){
        return lastName.replaceAll("\\s","") + " " + firstName;
    }


}
