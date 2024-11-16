public class UserModel {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String totalprice;
    private String depositpaid;
    private String bookingdates;
    private String additionalneeds;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;

    }
    public UserModel(String firstname,String lastname,String totalprice,String depositpaid,String bookingdates,String additionalneeds){
        this.firstname=firstname;
        this.lastname=lastname;
        this.totalprice=totalprice;
        this.depositpaid=depositpaid;
        this.bookingdates=bookingdates;
        this.additionalneeds=additionalneeds;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(String depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(String bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public UserModel(){

    }
}