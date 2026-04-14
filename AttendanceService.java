import java.util.*;

public class AttendanceService {

    Map<Long, String> attendance = new HashMap<>();

    public void markAttendance(Long studentId, String status) {
        attendance.put(studentId, status);
    }

    public void showAttendance() {
        for (Map.Entry<Long, String> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
