package model;

import java.util.Date;

public class Member {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.UID
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	private String uid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.Name
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.Memo
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	private String memo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.AddTime
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	private Date addtime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.UID
	 * @return  the value of member.UID
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.UID
	 * @param uid  the value for member.UID
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.Name
	 * @return  the value of member.Name
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.Name
	 * @param name  the value for member.Name
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.Memo
	 * @return  the value of member.Memo
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.Memo
	 * @param memo  the value for member.Memo
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.AddTime
	 * @return  the value of member.AddTime
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public Date getAddtime() {
		return addtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.AddTime
	 * @param addtime  the value for member.AddTime
	 * @mbggenerated  Wed Nov 04 15:44:56 CST 2015
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
}