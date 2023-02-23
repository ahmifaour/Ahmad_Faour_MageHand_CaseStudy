package com.ahmi.magehand.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * An Entity class representing a player character's class in a tabletop RPG.
 * 
 * This class is mapped to a database table named "Classes".
 */
@Entity
@Table(name = "Classes")
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;

	@Column(name = "Class Name", length = 50, nullable = false)
	private String className;

	@Column(name = "Class Description", length = 500, nullable = false)
	private String classDesc;

	/**
	 * 
	 * Constructs an instance of the Classes class with default values.
	 */
	public Classes() {
	}

	/**
	 * 
	 * Constructs an instance of the Classes class with the specified values.
	 * 
	 * @param classId              the unique identifier of the class
	 * 
	 * @param className            the name of the class
	 * 
	 * @param classCharacterSheets the collection of character sheets associated
	 *                             with the class
	 */
	public Classes(int classId, String className, String classDesc) {

		this.classId = classId;
		this.className = className;
		this.classDesc = classDesc;

	}

	/**
	 * 
	 * Returns the unique identifier of the class.
	 * 
	 * @return the unique identifier of the class
	 */
	public int getClassId() {

		return classId;

	}

	/**
	 * 
	 * Sets the unique identifier of the class.
	 * 
	 * @param classId the unique identifier of the class to set
	 */
	public void setClassId(int classId) {

		this.classId = classId;

	}

	/**
	 * 
	 * Returns the name of the class.
	 * 
	 * @return the name of the class
	 */
	public String getClassName() {

		return className;

	}

	/**
	 * 
	 * Sets the name of the class.
	 * 
	 * @param className the name of the class to set
	 */
	public void setClassName(String className) {

		this.className = className;

	}

	public String getClassDesc() {

		return classDesc;

	}

	public void setClassDesc(String classDesc) {

		this.classDesc = classDesc;

	}

	/**
	 * 
	 * Returns a string representation of the Classes object.
	 * 
	 * @return a string representation of the Classes object
	 */
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", classDesc=" + classDesc + "]";
	}

	/**
	 * 
	 * Returns a hash code value for the Classes object.
	 * 
	 * @return a hash code value for the Classes object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(classDesc, classId, className);
	}

	/**
	 * 
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj the reference object with which to compare
	 * @return true if this object is the same as the obj argument; false otherwise
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classes other = (Classes) obj;
		return Objects.equals(classDesc, other.classDesc) && Objects.equals(classId, other.classId)
				&& Objects.equals(className, other.className);
	}

}
