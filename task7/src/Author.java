public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author: " + "name='" + name + '\'' + ", email='" + email + '\'' +
                ", gender=" + gender + '.';
    }

    public static void main(String[] args) {
        Author ahTeck = new Author("tan ah teck", "abb@gmail.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("ngh@mail.vn");
        System.out.println(ahTeck);
        System.out.println("Name: " +ahTeck.getName());
        System.out.println("Gender:" +ahTeck.getGender());
        System.out.println("Email:" + ahTeck.getEmail());
    }
}
