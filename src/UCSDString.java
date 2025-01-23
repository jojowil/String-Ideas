import java.util.Arrays;

public class UCSDString {

    private int length;
    private char[] data;
    public UCSDString() {
        length = 0;
        data = new char[255];
    }

    public UCSDString(String s) {
        length = s.length();
        data = new char[length];
        for (int i = 0; i < length; i++)
            data[i] = s.charAt(i);
    }

    public int length() {
        return length;
    }

    public char charAt(int i) {
        if (i < 0 || i >= length)
            throw new IndexOutOfBoundsException();
        return data[i];
    }

    @Override
    public String toString() {
        return new String(data);
    }
}
