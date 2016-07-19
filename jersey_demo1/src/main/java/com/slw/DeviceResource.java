/**
 * 
 */
package com.slw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.slw.dao.DeviceDao;
import com.slw.entity.Device;

/*** 
* <p>Title:DeviceResource </p>
* <p>Description: </p>
* <p>Company: 华夏教培</p> 
* @author 孙连伟
* @date 2016年7月18日 下午5:28:11
*/
@Path("device")
public class DeviceResource {

	private final DeviceDao dDao;
	
	public DeviceResource(){
		dDao=new DeviceDao();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Device get(@QueryParam("ip")final String deviceIp){
		Device device=null;
		if(deviceIp!=null){
			device=dDao.getDevice(deviceIp);
		}
		return device;
	}
}
