class Author{
    private String name, email = "";
    private char gender = ' ';

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    private String getName() {
        return name;
    }

    private String getEmail() {
        return email;
    }

    private char getGender() {
        return gender;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String toString(){
        
    }
}