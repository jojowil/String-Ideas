import java.util.Arrays;

public class MyString {

    private int length;
    private int maxLength;
    private char[] str;

    public MyString(int length) {
        this.length = 0;
        this.maxLength = length;
        this.str = new char[length];
    }

    public MyString(String init) {
        length = init.length();
        maxLength = length;
        str = init.toCharArray();
    }

    public MyString(char[] str) {
        this.str = str;
        length = str.length;
    }

    public int length() {
        return length;
    }
    /*
    public int compare(MyString s) {

    }

    public int compare (String a) {

    }
    */
    @Override
    public String toString() {
        return new String(str);
    }

    public char charAt(int i) {
        if (i < 0 || i >= length)
            throw new IndexOutOfBoundsException();
        return str[i];
    }

    public MyString concat(MyString s) {
        char[] t = Arrays.copyOf(str, length+s.length);
        for (int x = 0 ; x < s.length; x++)
            t[x+length] = s.str[x];
        return new MyString(t);
    }

    public MyString concat(String s) {
        return concat(new MyString(s));
    }

    public int indexOf(char c) {
        for (int x = 0; x < length; x++)
            if (str[x] == c)
                return x;
        return -1;
    }

    public int indexOf(MyString s) {
        if (s.length == 0 || s.length > length)
            return -1;

        for (int x = 0; x < length-s.length+1; x++)
            for (int y = 0; y < s.length; y++) {
                if (str[x + y] != s.str[y])
                    break;
                return x;
            }
        return -1;
    }

    public int indexOf(String s) {
        return indexOf(new MyString(s));
    }
}
