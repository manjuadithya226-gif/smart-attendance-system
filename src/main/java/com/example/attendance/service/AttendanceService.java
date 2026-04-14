package com.example.attendance.service;

import com.example.attendance.model.Attendance;
import com.example.attendance.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository repo;

    public Attendance markAttendance(Attendance a) {
        return repo.save(a);
    }

    public List<Attendance> getAll() {
        return repo.findAll();
    }
}
