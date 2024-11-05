package org.example.singleton.singleThreaded;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
