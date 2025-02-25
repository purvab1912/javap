public class add {
    public static void main(String[] args) {
        To_add td = new To_add();
        td.show();
    }

}

class To_add {
    int maths, java, python, total;

    public To_add() {
        maths = 80;
        java = 90;
        python = 70;
        total = maths + java + python;

    }

    void show() {
        double percentage = (total) / 3;
        System.out.println(percentage);
    }
}