public class student {


    // variables Declared --------------------------------------------------
    public String name;
    public int roll;
    public int percentage;




    public String pass;




    // functions --------------------------------------------------

    public boolean passfail(){
        if (percentage<= 35){
            System.out.println(name + " you are failed");
            return false;
        }
        else{
            System.out.println(name + " you are passed");
            return true;
        }
    }






    // getter and setter of the class --------------------------------------------------

    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Roll no getter and setter
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Percentage getter and setter
    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    // pass getter and setter

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
