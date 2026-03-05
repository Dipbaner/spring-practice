package com.example.service;

public class StudentService {

    private Teacher teacher;
    private NotificationService notificationService;

    // Constructor Injection
    StudentService(Teacher teacher){
        this.teacher = teacher;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void enrollStudent(String name){
        System.out.println(name+" Enrolled Successfully");
        teacher.teach();
        notificationService.sendMessage("Welcome "+name);
    }
}
