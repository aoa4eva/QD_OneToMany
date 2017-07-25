package me.aoa4eva.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Message {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private long id; 
	 	  
	  private String message; 
	  
	  @CreationTimestamp
	  @Column
	  private java.sql.Timestamp createdDate;
	  
	 // private Date createdAt; 
	  
	  //Allow automatic update of the timestamp, don't let it stay empty
	  //@Temporal(TemporalType.TIMESTAMP)
	  //private Date lastUpdated;


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the createdAt
	 */
	/*public Date getCreatedAt() {
		return createdAt;
	}*/

	/**
	 * @param createdAt the createdAt to set
	 */
	/*public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	*//**
	 * @return the lastUpdated
	 *//*
	public Date getLastUpdated() {
		return lastUpdated;
	}

	*//**
	 * @param lastUpdated the lastUpdated to set
	 *//*
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
*/
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



}
