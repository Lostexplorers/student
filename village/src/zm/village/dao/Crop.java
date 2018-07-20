package zm.village.dao;

import java.sql.Timestamp;

/**
 * @author 李子帆
 * @version 1.0 
 * @date 2018年7月13日 下午4:48:16
 * @Description 土地可种植(待售)的作物类，数据库对应rel_land_inf表
 */
public final class Crop implements java.io.Serializable {
	
	private static final long serialVersionUID = 284382142246199178L;
	
	//rel_land_id
	private Integer id;
	//作物所属土地，对应rel_land_type
	private Land land;
	//作物名称，对应rel_land_crop_type
	private Dictionary crop;
	//作物附加价格，对应rel_land_crop_price
	private Double price;
	//可种植的最早时间，对应rel_land_crop_starttime
	private Timestamp startTime;
	//可种植的最晚时间，对应rel_land_crop_endtime
	private Timestamp endTime;
	 
	public Crop() {
	}
	
	public Crop(Land land, Dictionary crop, Double price, Timestamp startTime, Timestamp endTime) {
		this();
		this.land = land;
		this.price = price;
		this.endTime = endTime;
		this.startTime = startTime;
		this.setCrop(crop);
	}
	
	
	public Integer getId() {
		return id;
	}
	
	/**
	 * 不要调用
	 */
	@Deprecated
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 获取对应的土地对象
	 * @return Land土地对象
	 */
	public Land getLand() {
		return land;
	}
	
	/**
	 * 设置对应的土地对象
	 * @param land Land对象
	 */
	public void setLand(Land land) {
		this.land = land;
	}
	
	/**
	 * 获取附加价格
	 * @return Double类型价格
	 */
	public Double getPrice() {
		return price;
	}
	
	/**
	 * 设置附加价格
	 * @param price Double类型价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * 获取作物耕种最早时间
	 * @return java.sql.Timestamp时间对象
	 */
	public Timestamp getStartTime() {
		return startTime;
	}
	
	/**
	 * 设置作物耕种最早时间
	 * @param startTime java.sql.Timestamp时间对象
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * 获取作物耕种最晚时间
	 * @return java.sql.Timestamp时间对象
	 */
	public Timestamp getEndTime() {
		return endTime;
	}
	
	/**
	 * 设置作物耕种最晚耕种时间
	 * @param startTime java.sql.Timestamp时间对象
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取作物类型
	 * @return Dictionary 数据字典对象
	 */
	public Dictionary getCrop() {
		return crop;
	}
	
	/**
	 * @return 字典对应的农作物名称
	 */
	public String getCropName() {
		return crop.getName();
	}
	
	/**
	 * @return 字典对应的默认图片
	 */
	public String getCropImgURL() {
		return crop.getImgURL();
	}
	
	/**
	 * @return 字典对应的介绍
	 */
	public String getCropIntroduce() {
		return crop.getIntroduce();
	}

	/**
	 * 设置作物类型
	 * @param Dictionary 数据字典对象
	 */
	public void setCrop(Dictionary crop) {
		this.crop = crop;
	}
}
