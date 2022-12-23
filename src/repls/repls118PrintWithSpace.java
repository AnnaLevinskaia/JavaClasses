package repls;

public class repls118PrintWithSpace {

    String method(String spaceOut){
        for(int i=0; i<spaceOut.length(); i++) {
            System.out.print((spaceOut.charAt(i))+" ");
        }

        return spaceOut;
    }

    public static void main(String[] args) {

        repls118PrintWithSpace obj = new repls118PrintWithSpace();
        obj.method("hello");




    }
}
