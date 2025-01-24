public class StringTester {

    public static void main(String[] args) {

        MyString s = new MyString("My really cool content");

        System.out.println(s.length() + " " + s);
        System.out.println(s.indexOf('!'));
        System.out.println(s.indexOf('M'));
        System.out.println(s.indexOf("cool"));
        System.out.println(s.indexOf("My"));
        System.out.println(s.indexOf("tent"));

        MyString t = new MyString("acbd1234");
        MyString u = s.concat(t);
        System.out.println(u.length() + " " + u);

    }
}
