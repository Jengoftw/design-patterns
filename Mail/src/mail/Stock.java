package mail;

public class Stock {
    String name;
    String newLocation;


    public Stock(String name,String newLocation){
        this.name=name;
        this.newLocation=newLocation;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setnewLocation(String newLocation) {
        this.newLocation = newLocation;
    }

    public String getName() {
        return name;
    }

    public String getnewLocation() {
        return newLocation;
    }
}