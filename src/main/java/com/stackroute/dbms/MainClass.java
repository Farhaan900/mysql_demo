package com.stackroute.dbms;

public class MainClass {
    public static void main(String[] args) {

        try{

            UserController userController = new UserController();
            userController.deleter("Farhaan");
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{

            UserController userController = new UserController();
            userController.updater("Mohammed",23);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{

            UserController userController = new UserController();
            userController.displayer();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{

            UserController userController = new UserController();
            userController.displayerByName("Mohammed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
