CREATE TABLE Users (
  mobile varchar(11) NOT NULL,
  name varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mobile`)
) 


CREATE TABLE Doctors (
  doctorid varchar(10) NOT NULL,
  name varchar(255) DEFAULT NULL,
  mobile varchar(255) DEFAULT NULL,
  PRIMARY KEY (`doctorid`)
) 

INSERT INTO Doctors VALUES("00YAH","Yash Aman Hospital","9152624707"),
("00MRH","Marwar Hospital","9772844440"),
("00GHR","Goyal Hospital & Research Center Pvt Ltd","291-2432144"),
("00NMB","Dr. Nitin Mirdha Bds Mds Mirdha Dental Hospital","9152491758"),
("00VNH","Vinayaka Hospital","9152598987"),
("00MDM","MATHURA DAS MATHUR HOSPITAL (MDM),Jodhpur","291-2438655")


CREATE TABLE Appointments (
	appointment_id int(6) unsigned NOT NULL AUTO_INCREMENT,
	user_mobile varchar(11) NOT NULL,
	doctorid varchar(10) NOT NULL,
	date DATE NOT NULL,
	primary key (`appointment_id`)
)