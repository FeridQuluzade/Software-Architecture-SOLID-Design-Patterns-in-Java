package solidprinciple.dependencyinversion.example;

//this is the abstract layer
public interface DatabaseDriver {

    void connect();

    void disconnect();

}
