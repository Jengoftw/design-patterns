package mail;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=1;

        Line country1line = new Line("Country 1");
        Line country2line = new Line("Country 2");
        Line country3line = new Line("Country 3");
        Storehouse storehouse = new Storehouse();



        while(n==1){
            String name;
            String newLocation;
            System.out.println("Enter package name: ");
            name=sc.nextLine();
            System.out.println("Enter package new location: ");
            newLocation=sc.nextLine();
            Stock stock=new Stock(name,newLocation);
            if(stock.newLocation.equals(country1line.newLocation)){
            	storehouse.stock.add(stock);
            }else if(stock.newLocation.equals(country2line.newLocation)){
            	storehouse.stock.add(stock);
            }else if(stock.newLocation.equals(country3line.newLocation)){
            	storehouse.stock.add(stock);
            }else{
                System.out.println("Package new location doesnt exist.");
            }
            System.out.println("If you would like to send another stock, press any other number than 1, else press 1: ");
            n=sc.nextInt();
        }
    }
}