package HW110423_Task1;

abstract public class MyExeption extends Exception {
    private final String str;

    public MyExeption(String message, String str) {
        super(message);
        this.str = str;
    }

    public String getX() {
        return this.str;
    }

    

}
