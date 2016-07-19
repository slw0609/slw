/**
 * 
 */
package com.slw.dao;

import java.util.concurrent.ConcurrentHashMap;

import com.slw.entity.Device;

/*** 
* <p>Title:DeviceDao </p>
* <p>Description: </p>
* <p>Company: 华夏教培</p> 
* @author 孙连伟
* @date 2016年7月18日 下午5:33:44
*/
public class DeviceDao {

	ConcurrentHashMap<String, Device> chm=new ConcurrentHashMap<>();
	public DeviceDao(){
		chm.put("10.11.58.163", new Device("10.11.58.163"));
		chm.put("10.11.58.188", new Device("10.11.58.188"));
	}
	
	public Device getDevice(String ip){
		return chm.get(ip);
	}
	
	public Device updateDevice(Device device){
		String ip=device.getDeviceIp();
		chm.put(ip, device);
		return chm.get(ip);
	}
}
