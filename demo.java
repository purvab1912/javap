
//file should be save as name of the first class like here public class have demo name so file has a name demo.java

import javax.print.DocFlavor.STRING;

public class demo {

    public static void main(String[] args) {
        student s1 = new student();
        s1.show();
    }

}

class student {
    STRING name;
    int last;
    int rollno;
    long name1;
    byte name2;
    boolean name3;
    char name4;
    float name5;

    void show() {
        System.out.println(rollno);
        System.out.println(name);// giving null as a output means it is not pointing to any address
        System.out.println(last);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
    }

}