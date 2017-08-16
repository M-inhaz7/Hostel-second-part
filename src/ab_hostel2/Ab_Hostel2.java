
package ab_hostel2;

class Room{
    int id,price;
    String name,availability,type;
    Room(int i,int p,String n, String a,String t){
        id = i;
        price = p;
        name = n;
        availability = a;
        type = t;
    }
}
class Service{
    String name;
    int price;
    String type;
    Service(String name,int price,String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
class Student{
    int id;
    String name,room_info,Service_info;
    Student(int id, String name, String room, String Service){
        this.id = id;
        this.name = name;
        room_info =room;
        Service_info = Service;
    }
}
class manager{
    int id;
    String name;
    manager(int id,String name){
        this.id = id;
        this.name = name;
    }
    String rent(Student s,Room r){
        if(s.room_info.equals(r.type) && r.availability.equals("Yes")){
            return String.valueOf(r.price);
        }
        else{
            return "No";
        }
    }
    int sale(Student s, Service sr){
        if(s.Service_info.equals("Food-Full"))
            return sr.price;
        else if(s.Service_info.equals("Food-half"))
            return sr.price;
        else
            return 0;
    }
    void total_price(Student s, Service sr, Room r){
        if(rent(s,r).equals("No")){
            System.out.println("Sorry! Your room is not available");
        }
        else{
            System.out.println("Your room is available");
            System.out.println("Total price is: "+(Integer.parseInt(rent(s,r))+sale(s,sr)));
            r.availability = "No";
        }
    }
}

public class Ab_Hostel2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Student S = new Student(1,"Abir","Small","Food-Full");
        Room r = new Room(1,700,"Small Room","Yes","Small");
        Service sr = new Service("Food-Service",1000,"Food-Full");
        manager M = new manager(1, "John");
        M.total_price(S, sr, r);
    }
    
}
