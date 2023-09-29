package com.systechafrica.assignments.pos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.CustomFormatter;
import com.systechafrica.reusablecode.ReusableCode;

public class POSSystemReviewed {
    private static final Logger LOGGER = Logger.getLogger(POSSystemReviewed.class.getName());
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    final int MAX_NO = 100;
    Item[] items = new Item[MAX_NO];
    int noOfItems = 0;
    int itemNumber = 1;
    Item buy = new Item();
    double sumOfTotalValue = 0;
    double amountByCustomer;
    double changeBack;

    public static void main(String[] args) { 
        
        try{
            POSSystemReviewed pos = new POSSystemReviewed();
            pos.fileLogger();
            
            Scanner scanner = new Scanner(System.in);
            ReusableCode rs = new ReusableCode();
            DBConnection db = new DBConnection();

            Connection connection = db.connectToDB();
            boolean logInSuccess = rs.login();
            
            if (logInSuccess){
                System.out.println("Successful Login.");
                System.out.println();
                boolean showMenu = true;
                while (showMenu){
                    pos.displayMenu();
                    int option = scanner.nextInt();
                    System.out.println();
                    System.out.println("...");
                    switch (option) {
                        case 1:
                            pos.addItem(connection);
                            pos.itemsListed(connection);
                            break;
                        case 2:
                            pos.itemsListed(connection);
                            pos.makePayment();
                            break;
                        case 3:
                            pos.itemsListed(connection);
                            pos.displayReceipt();
                            break;
                        case 4:
                            pos.clearItemTable(connection);
                            System.exit(0);
                    
                        default:
                            System.out.println("You have entered an invalid option.");
                            System.out.println("Choose a another option.");
                            break;
                    }
                }
            }else{
                System.out.println("You have exhausted your log in attempts.");
            }
            
            connection.close();
            scanner.close();
            
        }catch (InputMismatchException e){
            LOGGER.severe("Wrong input type. "+ e.getMessage());
        } catch(NoSuchElementException e){
            LOGGER.severe("Element being requested does not exist. "+e.getMessage());
        } catch(IllegalStateException e){
            LOGGER.severe("Scanner is closed. "+e.getMessage());
        }catch(SQLException e){
            LOGGER.severe("problem with db connection. "+ e.getMessage());
        }
    }

    public void displayMenu(){
        System.out.println("-----------------");
        System.out.println("SYSTEM POS SYSTEM");
        System.out.println("-----------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");
        System.out.println("4. QUIT");
        System.out.println(" ");
        System.out.println("Choose an option");

    }
    
    public void addItem(Connection connection) throws SQLException{
        //Create item table
        Statement statement = connection.createStatement();//enables sending SQL statements to the db
        String createItemsTable = "CREATE TABLE IF NOT EXISTS items(itemcode INT, quantity INT, unitprice DOUBLE PRECISION,totalprice DOUBLE PRECISION) ENGINE=INNODB";
        int updateStatus = statement.executeUpdate(createItemsTable);
        LOGGER.info("Update status= " + updateStatus);//confirms table is created,if status is 0

        while(true){
            System.out.print("Enter Item Code: ");
            int itemCode = scanner.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            while (quantity < 0) {
                System.out.print("Sorry, but your quantity must be a positive number. Enter a price:  ");
                quantity = scanner.nextInt();
            }
            System.out.print("Enter the Unit Price: ");
            double unitPrice = scanner.nextDouble();
            while (unitPrice < 0 ) {
                System.out.print("Sorry, but your price must be a positive decimal. Enter a price:  ");
                unitPrice = scanner.nextDouble();
            }

            //Insert to table
            String insertQuery = "insert into items (itemcode, quantity, unitprice)values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);//pdstmt = preparedStatement

            preparedStatement.setInt(1, itemCode);
            preparedStatement.setInt(2, quantity );
            preparedStatement.setDouble(3, unitPrice);
            int noOfRows = preparedStatement.executeUpdate();
            LOGGER.info("Rows added=" + noOfRows);
            noOfItems++;//count number of items entered

            System.out.print("More items? Press any key for more items or N for no more item:-> ");
            String moreItems = scanner.next();
            if(moreItems.equalsIgnoreCase("N")){
                break;
            }
            preparedStatement.close();
        }
    }
    
    public void itemsListed(Connection connection) throws SQLException{
        Statement statement= connection.createStatement();
        System.out.print("Item Code  "+ "Quantity  "+ " Unit Price   "+ "Total Value");
        System.out.println();
        sumOfTotalValue = 0;

        //get items from db
        String selectItems = "SELECT * FROM items;";
        ResultSet resultSet = statement.executeQuery(selectItems);
        while (resultSet.next()) {
            int itemCode = resultSet.getInt("itemcode");
            int quantity = resultSet.getInt("quantity");
            double unitPrice = resultSet.getDouble("unitprice");
            double totalPrice = quantity * unitPrice;
            System.out.println("   " + itemCode+"         " + quantity+ "          " + unitPrice+ "          " + totalPrice);
        
            sumOfTotalValue += totalPrice;
        }
        resultSet.close();
    }

    public void makePayment(){
      
        System.out.println("Your total amount is: "  + sumOfTotalValue);
        System.out.println("Ask payment from customer.");
        amountByCustomer = scanner.nextDouble();
        if (amountByCustomer > sumOfTotalValue){
            changeBack = amountByCustomer - sumOfTotalValue;
        }
        else{
            System.out.println("The amount is insufficient. Add some more. ");
        }
}

    public void displayReceipt(){
        System.out.println("*********************************************");
        System.out.println("Total: "  + sumOfTotalValue);
        System.out.println("*********************************************");
        System.out.println("Enter the amount given by customer:  " + amountByCustomer);
        System.out.println("Change:  " + changeBack);
        System.out.println("*********************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("*********************************************");
        
    }

    public void fileLogger() {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("Java-training\\pos-logger.txt");
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);
        } catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the log file: " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the log file: " + e.getMessage());
        }
    }

    public void clearItemTable(Connection connection) throws SQLException{
        Statement statement= connection.createStatement();
        String deleteItems = "DROP TABLE items;";
        statement.execute(deleteItems);
        noOfItems = 0;
        LOGGER.info("Items deleted successfully");
        statement.close();
    }
}

/*
 * Initial changes are;
 * 1. Creation of POSReviewed
 * 2. inclusion of exceptions
 * 3. Division of display output
 * 4. Addition of quit option
 * 2nd implementation
 * 5. Connection to db, create table,insert items, fetch items, delete items
 * 6. Logging file
 */
