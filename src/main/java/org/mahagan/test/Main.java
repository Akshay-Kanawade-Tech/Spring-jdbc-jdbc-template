package org.mahagan.test;

import org.mahagan.Config.ApplicationConfig;
import org.mahagan.dao.IOTDevice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationConfig.class);
        IOTDevice iotDevice = applicationContext.getBean(IOTDevice.class);

        System.out.println("List of device is:");
        for(org.mahagan.model.IOTDevice iotDevice1:iotDevice.getAllDevice()){
            System.out.println(iotDevice1);
        }

        System.out.println("\nGet Device of ID 3:");

        //========================================================

        org.mahagan.model.IOTDevice deviceBYId =iotDevice.getDeviceById(12);
        System.out.println(deviceBYId);

        //====================================================================
        System.out.println("\nCreated IOT device is:");

        org.mahagan.model.IOTDevice device = new org.mahagan.model.IOTDevice(23,"Modbus","Pune","robotic");
        System.out.println(device);
        iotDevice.createIotDevice(device);

        //=====================================================================

        System.out.println("\nList of Person is:");
        for(org.mahagan.model.IOTDevice device1 : iotDevice.getAllDevice()){
            System.out.println(device1);
        }

        //====================================================================

        System.out.println("\nDelete device by id:");
        iotDevice.deleteDevice(deviceBYId);


        //-=============================================================

        System.out.println("\nUpdate:");

        org.mahagan.model.IOTDevice ddevice =iotDevice.getDeviceById(13);

        ddevice.setDeviceName("IOT 12345");
        ddevice.setDeviceNameLocation("PPune1");
        ddevice.setDeviceFunction("Robotr");
        iotDevice.updateDevice(ddevice);

        System.out.println("Device Updated");

        //===============================================================
        System.out.println("List of device is:");
        for(org.mahagan.model.IOTDevice iotDeviceNew :iotDevice.getAllDevice()){
            System.out.println(iotDeviceNew);
        }
        applicationContext.close();
    }

}
