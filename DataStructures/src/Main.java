public class Main {

    private int myInt;
    private String myString;
    private float myFloat;

    public void setMyInt(int newVal){
        myInt = newVal;
    }
    public void setMyString(String newMyString){
        myString = newMyString;
    }
    public void setMyFloat(float newMyFloat){
        myFloat = newMyFloat;
    }

    public int getMyInt(){
        return myInt;
    }
    public String getMyString(){
        return myString;
    }
    public float getMyFloat() {
        return myFloat;
    }


    public Main(int myInt, String myString, float myFloat) {
        this.myInt = myInt;
        this.myString = myString;
        this.myFloat = myFloat;
    }

    public Main(int myInt){
        this.myInt = myInt;
    }

    public Main(){

    }





}
