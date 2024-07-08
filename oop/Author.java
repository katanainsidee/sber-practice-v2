public class Author {
    String name;
    String gender;
    String email;

    public Author(String name, String gender, String email) throws Exception {
        this.setName(name);
        this.setGender(gender);
        this.setEmail(email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) throws Exception {
        if (gender.equals("male") || gender.equals("female")) {
            this.gender = gender;
        }
        else {
            throw new Exception("Bro, you taking risk for 6.21 KoAP Russian Federation. Change your mind right now please. ONLY 2 GENDERS!!!");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        return "%s, %s, %s".formatted(this.name, this.gender, this.email);
    }
}
