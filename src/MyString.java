public class MyString {

    int length;
    int maxLength;
    private char[] str;

    public MyString(int length) {
        this.length = 0;
        this.maxLength = length;
        this.str = new char[length];
    }

    public MyString(String init){
        length = init.length();
        str = new char[length];
        str = init.toCharArray();
    }

    public MyString(char[] str){
        this.str = str;
        length = str.length;
    }

    @Override
    public String toString() {
        return new String(str);
    }

    public char charAt(int i) {
        if (i < 0 || i >= length)
            throw new IndexOutOfBoundsException();
        return str[i];
    }

}
