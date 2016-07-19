/**
 * 
 */
package com.slw.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/*** 
* <p>Title:Device </p>
* <p>Description: </p>
* <p>Company: 华夏教培</p> 
* @author 孙连伟
* @date 2016年7月18日 下午5:25:53
*/
@XmlRootElement(name="device")
public class Device {

	private String deviceIp;
	private int deviceStatus;
	
	public Device(String deviceIp){
		this.deviceIp=deviceIp;
	}
	public Device(){
		
	}
	/**
	 * @return the deviceIp
	 */
	public String getDeviceIp() {
		return deviceIp;
	}

	/**
	 * @param deviceIp the deviceIp to set
	 */
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	/**
	 * @return the deviceStatus
	 */
	@XmlAttribute
	public int getDeviceStatus() {
		return deviceStatus;
	}

	/**
	 * @param deviceStatus the deviceStatus to set
	 */
	public void setDeviceStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
	
}
