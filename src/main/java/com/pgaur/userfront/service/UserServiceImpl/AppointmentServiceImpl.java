package com.pgaur.userfront.service.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgaur.userfront.dao.AppointmentDao;
import com.pgaur.userfront.domain.Appointment;
import com.pgaur.userfront.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
       return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    /*
    public Appointment findAppointment(Long id) {
        return appointmentDao.findOne(id);
    }*/

    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }

	@Override
	public Appointment findAppointment(Long id) {
		return null;
	}
}
