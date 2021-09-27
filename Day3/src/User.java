public class User {


    private String userName;
    private String Address;
    private String phoneNumber;

    public void disply(){
        System.out.println(userName+" : "+Address+" : "+phoneNumber);
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userNam){
        this.userName = userNam;

    }



    public static void main(String[] args) {

        User object1 = new User();

        object1.Address = "Rajeev nagar";
        object1.userName = "shantam";
        object1.phoneNumber = "1231312";


        User object2 = new User();
        object2.userName = "testuser2";
        object2.Address = "MGRoad";
        object2.phoneNumber = "123i13910";
        object2.disply();


    }

}


