public class PRent {

    private String name;
    private String email; 

    public PRent(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + ", " + email;

}
}


