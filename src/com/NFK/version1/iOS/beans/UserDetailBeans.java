package com.NFK.version1.iOS.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class UserDetailBeans extends BaseDataBean{
	
	String emailID;
	String password;
    String firstName;
    String middleName;
    String lastName;
    String username;
    String birthdayMonth;
    String currentPassword;
    String newPassword;
    String newconfirmPassword;
	String invalidFormat;
    
	String minLengthValidation;
    String confirmEmail;
    String existingEmail; 
    String notAllowedCharacters;
    String confirmPassword;
	String MinCharacters;

    public String getCurrentPassword() {
    return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
    return newPassword;
    }

    public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
    }

    public String getNewconfirmPassword() {
    return newconfirmPassword;
    }

    public void setNewconfirmPassword(String newconfirmPassword) {
    this.newconfirmPassword = newconfirmPassword;
    }
    
    public String getDependentemail() {
		return dependentemail;
	}
	public void setDependentemail(String dependentemail) {
		this.dependentemail = dependentemail;
	}
	public String getDependentpassword() {
		return dependentpassword;
	}
	public void setDependentpassword(String dependentpassword) {
		this.dependentpassword = dependentpassword;
	}
	String birthdayDate;
    String birthdayYear;
    String belowAge;
    String clinicCode;
    String officName;
    String officeNumber;
    String suffix;
    String address1;
    String address2;
    String address3;
    String city;
    String state;
    String zipCode;
    String phoneNumber;
    String glucosecompare;
    String glucosecompareios;
    String guardianfname;
    String guardianlname;
    String guardianpassword;
    String guardianconfirmpassword;
    String dependentDOBmonth;
    String dependentDOByear;
    String dependentemail;
    String dependentpassword;
    String dependentemailId;
    String dependentfname;
    String dependentmname;
    String dependentlname;
    String dependentbirthyr;
    String dependentsuffix;
    String dependentaddress1;
    String dependentaddress2;
    String dependentaddress3;
    String dependentcity;
    String dependentstate;
    String dependentzipcode;
    String dependentphone;
    
    
   	public String getDependentemailId() {
		return dependentemailId;
	}
	public void setDependentemailId(String dependentemailId) {
		this.dependentemailId = dependentemailId;
	}
	public String getDependentfname() {
		return dependentfname;
	}
	public void setDependentfname(String dependentfname) {
		this.dependentfname = dependentfname;
	}
	public String getDependentmname() {
		return dependentmname;
	}
	public void setDependentmname(String dependentmname) {
		this.dependentmname = dependentmname;
	}
	public String getDependentlname() {
		return dependentlname;
	}
	public void setDependentlname(String dependentlname) {
		this.dependentlname = dependentlname;
	}
	public String getDependentbirthyr() {
		return dependentbirthyr;
	}
	public void setDependentbirthyr(String dependentbirthyr) {
		this.dependentbirthyr = dependentbirthyr;
	}
	public String getDependentsuffix() {
		return dependentsuffix;
	}
	public void setDependentsuffix(String dependentsuffix) {
		this.dependentsuffix = dependentsuffix;
	}
	public String getDependentaddress1() {
		return dependentaddress1;
	}
	public void setDependentaddress1(String dependentaddress1) {
		this.dependentaddress1 = dependentaddress1;
	}
	public String getDependentaddress2() {
		return dependentaddress2;
	}
	public void setDependentaddress2(String dependentaddress2) {
		this.dependentaddress2 = dependentaddress2;
	}
	public String getDependentaddress3() {
		return dependentaddress3;
	}
	public void setDependentaddress3(String dependentaddress3) {
		this.dependentaddress3 = dependentaddress3;
	}
	public String getDependentcity() {
		return dependentcity;
	}
	public void setDependentcity(String dependentcity) {
		this.dependentcity = dependentcity;
	}
	public String getDependentstate() {
		return dependentstate;
	}
	public void setDependentstate(String dependentstate) {
		this.dependentstate = dependentstate;
	}
	public String getDependentzipcode() {
		return dependentzipcode;
	}
	public void setDependentzipcode(String dependentzipcode) {
		this.dependentzipcode = dependentzipcode;
	}
	public String getDependentphone() {
		return dependentphone;
	}
	public void setDependentphone(String dependentphone) {
		this.dependentphone = dependentphone;
	}
	public String getDependentDOBmonth() {
		return dependentDOBmonth;
	}
	public void setDependentDOBmonth(String dependentDOBmonth) {
		this.dependentDOBmonth = dependentDOBmonth;
	}
	public String getDependentDOByear() {
		return dependentDOByear;
	}
	public void setDependentDOByear(String dependentDOByear) {
		this.dependentDOByear = dependentDOByear;
	}
	public String getGuardianfname() {
		return guardianfname;
	}
	public void setGuardianfname(String guardianfname) {
		this.guardianfname = guardianfname;
	}
	public String getGuardianlname() {
		return guardianlname;
	}
	public void setGuardianlname(String guardianlname) {
		this.guardianlname = guardianlname;
	}
	public String getGuardianpassword() {
		return guardianpassword;
	}
	public void setGuardianpassword(String guardianpassword) {
		this.guardianpassword = guardianpassword;
	}
	public String getGuardianconfirmpassword() {
		return guardianconfirmpassword;
	}
	public void setGuardianconfirmpassword(String guardianconfirmpassword) {
		this.guardianconfirmpassword = guardianconfirmpassword;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getClinicCode() {
		return clinicCode;
	}
	public void setClinicCode(String clinicCode) {
		this.clinicCode = clinicCode;
	}
	public String getOfficName() {
		return officName;
	}
	public void setOfficName(String officName) {
		this.officName = officName;
	}
	public String getBelowAge() {
   		return belowAge;
   	}
   	public void setBelowAge(String belowAge) {
   		this.belowAge = belowAge;
   	}
     
	public String getBirthdayMonth() {
		return birthdayMonth;
	}
	public void setBirthdayMonth(String birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
	public String getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getBirthdayYear() {
		return birthdayYear;
	}
	public void setBirthdayYear(String birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	 
	public String getBgcompare() {
		return glucosecompare;
	}
	public void setBgcompare(String glucosecompare) {
		this.glucosecompare = glucosecompare;
	}
	public String getInvalidFormat() {
		return invalidFormat;
	}

	public void setInvalidFormat(String invalidFormat) {
		this.invalidFormat = invalidFormat;
	}

	public String getMinLengthValidation() {
		return minLengthValidation;
	}

	public void setMinLengthValidation(String minLengthValidation) {
		this.minLengthValidation = minLengthValidation;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getExistingEmail() {
		return existingEmail;
	}

	public void setExistingEmail(String existingEmail) {
		this.existingEmail = existingEmail;
	}

	public String getNotAllowedCharacters() {
		return notAllowedCharacters;
	}

	public void setNotAllowedCharacters(String notAllowedCharacters) {
		this.notAllowedCharacters = notAllowedCharacters;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getMinCharacters() {
		return MinCharacters;
	}

	public void setMinCharacters(String minCharacters) {
		MinCharacters = minCharacters;
	}
}