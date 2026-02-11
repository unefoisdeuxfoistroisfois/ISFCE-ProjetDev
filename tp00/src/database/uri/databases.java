package database.uri;

public enum databases {
    H2(new H2 URL()), FIREBIRD(new Firebird_URL());

    Databases(IDbURL url) {// I pour interface 
        
    }
}
