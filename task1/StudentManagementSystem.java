package task1;

public class StudentManagementSystem {
	static boolean errorStatus = true;

	/**
	 * To validate age limit
	 * 
	 * @param age
	 * @return
	 * @throws AgeNotWithinRangeException
	 */
	public boolean checkAgeLimit(int age) throws AgeNotWithinRangeException {
		if (!(age < 15 && age < 21)) {
			errorStatus = false;
			throw new AgeNotWithinRangeException("Age Should be between 15 and 21. Please enter a correct age");
		}
		return errorStatus;
	}

	/**
	 * To validate the student name
	 * 
	 * @param name
	 * @return
	 * @throws NameNotValidException
	 */
	public boolean checkStudentName(String name) throws NameNotValidException {
		if ((!name.matches("^[a-zA-Z]*$"))) {
			errorStatus = false;
			throw new NameNotValidException(
					"Special Characters and numbers are not allowed. Please enter a valid name");
		}
		return errorStatus;
	}

}
