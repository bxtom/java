public class User {
    private String name;
    private String email;

    public User(String name) {
        this.name = name;
    }

    public void setEmail(String email) throws BadEmailException {
        if (!email.contains("@")) {
            throw new BadEmailException("Podano bledny email!");
        }
        this.email = email;
    }
}
