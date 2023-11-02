package org.example.dependencyInversionPrinciple;

public class Employee {
    private String empname;

    //FileSystemManager- database
//    void addEntry(DatabaseManager manager) {
//        manager.save(empname);
//    }

    //DatabaseManager - another database  in addEntry() everytime DB changes we
    //need tochange the values ie high module also changes if we change lower
    //module it is tightly coupled.To avoid we use interface
//    public class DatabaseManager {
//        public void save(String name) {
//            //store emp name to file
//        }
//    }

//    public class FileSystemManager {
//
//        public void save(String name) {
//            //store emp name to file
//        }
//    }

        public void addEntry(Storage manager) {
        manager.save(empname);
    }
}
