package tp00;

import database.uri.databases;

public class TestDB {

    public static void main(String[] args) {
       databases db = Databases.FIREBIRD; 
       System.out.println(db+ " "+db.ordinal());
       System.out.println(db.buildEmbeddedURL("maDB"));
       System.out.println(db.buildServeurURL("maDB", "192.168.0.5"));

       System.out.println(Databases.H2.hasMemoryMode());
    }
}
