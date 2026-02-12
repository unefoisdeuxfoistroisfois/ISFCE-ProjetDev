package database.uri;

public enum databases implements IDbURL {
    H2(new H2 URL()), FIREBIRD(new Firebird_URL());

    @Getter // pour mettre un getteur grace a lombok sa provient de lombok
    private IDbURL iDbURL;

    Databases(IDbURL url) {// I pour interface 
        this.iDbURL = url;

    }
}
