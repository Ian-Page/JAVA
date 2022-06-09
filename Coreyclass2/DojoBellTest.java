public class DojoBellTest{

    public static void main (String[]args){
        DojoBell db = new DojoBell();
        DojoBell db2 = new DojoBell();

        db.greeting();
        db.greeting("rachel");
        db2.greeting("Ian");

        db.makeArray();
        db.makeOrderList();
        db.makeHash();
    }
}