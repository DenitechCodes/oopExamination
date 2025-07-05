// File: Participant.java
public class Participant {
    private String name;
    private String faculty;
    private String projectTitle;
    private String contact;
    private String email;

    // Constructor
    public Participant(String name, String faculty, String projectTitle, String contact, String email) {
        this.name = name;
        this.faculty = faculty;
        this.projectTitle = projectTitle;
        this.contact = contact;
        this.email = email;
    }

    // Getters
    public String getName() { return name; }
    public String getFaculty() { return faculty; }
    public String getProjectTitle() { return projectTitle; }
    public String getContact() { return contact; }
    public String getEmail() { return email; }
}
