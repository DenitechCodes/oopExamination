// File: ParticipantDAO.java
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ParticipantDAO {
    public static void saveParticipant(Participant participant) throws Exception {
        String sql = "INSERT INTO Participants (StudentName, Faculty, ProjectTitle, ContactNumber, EmailAddress) " +
                     "VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, participant.getName());
            pstmt.setString(2, participant.getFaculty());
            pstmt.setString(3, participant.getProjectTitle());
            pstmt.setString(4, participant.getContact());
            pstmt.setString(5, participant.getEmail());
            
            pstmt.executeUpdate();
        }
    }
}