package database.uri;

public class SuperBaseURL implements IDbURL {

    @Override
    public String getUrl() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUrl'");
    }

    @Override
    public String buildMemURL(String file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildMemURL'");
    }

    @Override
    public String buildEmbeddedURL(String file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildEmbeddedURL'");
    }

    @Override
    public String buildServeurURL(String file, String ip) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildServeurURL'");
    }

    @Override
    public String buildServeurURL(String file, String ip, int port) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildServeurURL'");
    }

    @Override
    public int getDefaultPort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDefaultPort'");
    }

    @Override
    public boolean hasMemoryMode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasMemoryMode'");
    }

    @Override
    public boolean hasEmbeddedMode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasEmbeddedMode'");
    }

    @Override
    public boolean hasServeurMode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasServeurMode'");
    }

}
