package tp00;

import database.uri.databases;

public class TestDB {

    public static void main(String[] args) {
       databases db = Databases.FIREBIRD; 
       System.out.println(db+ " "+db.ordinal());
    }
}
