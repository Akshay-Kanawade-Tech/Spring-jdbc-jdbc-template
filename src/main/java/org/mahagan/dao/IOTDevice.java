package org.mahagan.dao;

import java.util.List;

public interface IOTDevice {
    org.mahagan.model.IOTDevice getDeviceById(int Id);

    List<org.mahagan.model.IOTDevice> getAllDevice();

    int deleteDevice(org.mahagan.model.IOTDevice iotDevice);

    int updateDevice(org.mahagan.model.IOTDevice iotDevice);

    int createIotDevice(org.mahagan.model.IOTDevice iotDevice);
}
