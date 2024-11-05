package org.example.singleton.doubleCheckingLocks;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
