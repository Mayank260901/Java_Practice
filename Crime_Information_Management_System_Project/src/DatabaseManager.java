import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/crime_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void addCrime(Crime crime) {
        String sqlCrime = "INSERT INTO crimes (date, place, crime_type, description, status) VALUES (?, ?, ?, ?, ?)";
        String sqlVictim = "INSERT INTO victims (crime_id, name) VALUES (?, ?)";
        String sqlSuspect = "INSERT INTO suspects (crime_id, name) VALUES (?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmtCrime = conn.prepareStatement(sqlCrime, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement pstmtVictim = conn.prepareStatement(sqlVictim);
             PreparedStatement pstmtSuspect = conn.prepareStatement(sqlSuspect)) {

            // Insert crime
            pstmtCrime.setDate(1, Date.valueOf(crime.getDate()));
            pstmtCrime.setString(2, crime.getPlace());
            pstmtCrime.setString(3, crime.getCrimeType());
            pstmtCrime.setString(4, crime.getDescription());
            pstmtCrime.setString(5, crime.getStatus());
            pstmtCrime.executeUpdate();

            ResultSet rs = pstmtCrime.getGeneratedKeys();
            int crimeId = 0;
            if (rs.next()) {
                crimeId = rs.getInt(1);
            }

            // Insert victims
            for (String victim : crime.getVictims()) {
                pstmtVictim.setInt(1, crimeId);
                pstmtVictim.setString(2, victim);
                pstmtVictim.executeUpdate();
            }

            // Insert suspects
            for (String suspect : crime.getSuspects()) {
                pstmtSuspect.setInt(1, crimeId);
                pstmtSuspect.setString(2, suspect);
                pstmtSuspect.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addCriminal(Criminal criminal) {
        String sqlCriminal = "INSERT INTO criminals (name, age, gender, address, identifying_mark, area_of_crime) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sqlCriminal)) {

            pstmt.setString(1, criminal.getName());
            pstmt.setInt(2, criminal.getAge());
            pstmt.setString(3, criminal.getGender());
            pstmt.setString(4, criminal.getAddress());
            pstmt.setString(5, criminal.getIdentifyingMark());
            pstmt.setString(6, criminal.getAreaOfCrime());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Crime> searchCrimes(String filter) {
        String sql = "SELECT * FROM crimes WHERE place LIKE ? OR crime_type LIKE ? OR description LIKE ?";
        List<Crime> crimes = new ArrayList<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + filter + "%");
            pstmt.setString(2, "%" + filter + "%");
            pstmt.setString(3, "%" + filter + "%");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Crime crime = new Crime(
                        rs.getDate("date").toString(),
                        rs.getString("place"),
                        rs.getString("crime_type"),
                        rs.getString("description")
                );
                crime.setStatus(rs.getString("status"));
                crimes.add(crime);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return crimes;
    }

    // Similar methods for searching criminals, updating crime status, and generating reports.
}

