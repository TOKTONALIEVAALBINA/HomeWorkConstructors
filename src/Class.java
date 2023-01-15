public class Class {
    private byte number;
    private String word;
    private int [] array;

    public Class ( byte number, String word , int [] array ){
        this.number = number;
        this.word = word;
        this.array = array;
    }

    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
