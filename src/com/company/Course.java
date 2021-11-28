package com.company;

public class Course {
    Course(String name, String topic, String teacher, int participants)
    {
    this.name = name;
    this.topic = topic;
    this.teacher = teacher;
    setParticipants(participants);
    }

    public String toString() {
        return name + ", " + topic + ", " + teacher + ", " + participants;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }

    public String  getTopic(String topic){
        return topic;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public String getTeacher(String teacher){
        return teacher;
    }

    public void setParticipants(int participants){
        this.participants = participants;
        if (participants < 0)
            System.out.println("participants cannot be negative!");
    }

    public int getParticipants(int participants){
        return participants;

    }

    public void hasParticipants(boolean participants, int participants1){
        this.participants = participants1;
        if (participants1 > 0 )
            participants = true;
    }

    public boolean hasParticipants(boolean participants){
        return participants;
    }


    private String name, topic, teacher;
    private int participants;

}
