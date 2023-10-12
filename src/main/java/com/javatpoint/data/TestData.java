package com.javatpoint.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.javatpoint.model.AppointmentDetails;
import com.javatpoint.model.Counsellor;

import ch.qos.logback.core.net.server.Client;

public class TestData {

    private static HashMap<String,Object> AppointmentDetails;

    private static HashMap<String,Counsellor> CounsellorMap;

    private static HashMap<String,com.javatpoint.model.Client> clientMap;

    private static HashMap<String,Object> Admin;

    private static HashMap<String,Object> Alert;


    public TestData()
{

    
    String start = "22-02-2023 16:00";
    String end = "22-02-2023 17:00";

    clientMap = new HashMap<>();

    com.javatpoint.model.Client client1 = new com.javatpoint.model.Client(1, "jack", "pune", "mumbai", "9873489039", "abcd", start,"josh" , "jill",end );
    com.javatpoint.model.Client client2 = new com.javatpoint.model.Client(2, "john", "pune", "delhi", "9873482039", "abcd", start,"josh" , "jill",end );

    clientMap.put( "1" , client1);
    clientMap.put( "2" , client2);



    CounsellorMap = new HashMap<>();

    Counsellor counsellor1 = new Counsellor(1, "happy", "pune", "mumbai", "8734378283", "Mtech", start, "admin", "admin", end);
    Counsellor counsellor2 = new Counsellor(1, "sunny", "pune", "mumbai", "8734362283", "Mtech", start, "admin", "admin", end);

    CounsellorMap.put("1", counsellor1);
    CounsellorMap.put("2", counsellor2);

    Map<String, AppointmentDetails> data = new HashMap<String, AppointmentDetails>();

   AppointmentDetails data1 = new AppointmentDetails("1", 1, 2, 1, "11-10-23 11:12:00", "11-10-23 11:12:00", "Pune", "Jack", "Inprogrss", 1,"11-10-23 11:12:00");

   AppointmentDetails data2 = new AppointmentDetails("2", 2, 2, 2, "11-10-23 11:12:00", "11-10-23 11:12:00", "Pune", "Jack", "Inprogrss", 1,"11-10-23 11:12:00");

AppointmentDetails data3 = new AppointmentDetails("3", 3, 3, 3, "11-10-23 11:12:00", "11-10-23 11:12:00", "Pune", "Jack", "Inprogrss", 1,"11-10-23 11:12:00");

 AppointmentDetails data4 = new AppointmentDetails("4", 4, 4, 4, "11-10-23 11:12:00", "11-10-23 11:12:00", "Pune", "Jack", "Inprogrss", 1,"11-10-23 11:12:00");

 

 data.put("1", data1);

 data.put("2", data2);

 data.put("3", data3);

}    
}
